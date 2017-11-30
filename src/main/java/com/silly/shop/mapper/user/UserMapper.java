package com.silly.shop.mapper.user;

import com.silly.shop.model.user.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

/**
 * Created by yunlong.zhang on 2017/11/7.
 */
@Mapper
@CacheConfig(cacheNames = "users")
public interface UserMapper {
    @Select("select *from user")
    List<User> getAllUser();

    @Cacheable(key = "#p0")
    User getUserfromId(String id);

    @CachePut(key = "#p0")
    void updatePswFromId(@Param("id") String id, @Param("email") String email, @Param("psw") String psw);

    @CacheEvict(key ="#p0",allEntries=true)
    void deleteUserFromId(String id);
}

package com.silly.shop.mapper.user;

import com.silly.shop.model.user.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by yunlong.zhang on 2017/11/7.
 */
@Mapper
public interface UserMapper {
    @Select("select *from user")
    List<User> getAllUser();
    User getUserById(String id);
}

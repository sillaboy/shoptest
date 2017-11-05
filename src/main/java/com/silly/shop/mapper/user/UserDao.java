package com.silly.shop.mapper.user;

import com.silly.shop.model.user.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by yunlong.zhang on 2017/11/5.
 */
@Mapper
public interface UserDao {
    @Select("select * from user where userid = #{userId}")
    User getUserById(String userId);
}

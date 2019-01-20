package com.xzc.mlshop.mapper;


import com.xzc.mlshop.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> findUserByName(String username);
    public int register(User user);
    public List<User> ListUser();
    public int insertUser(User user);
    public int Update(User user);

}

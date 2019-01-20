package com.xzc.mlshop.service;

import com.xzc.mlshop.entity.User;
import com.xzc.mlshop.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> findByName(String username) {
        return userMapper.findUserByName(username);
    }

    public User insertUser(User user) { userMapper.insertUser(user);return user;}

    public User register(User user) { userMapper.register(user);return user;}

    public List<User> ListUser(){
        return  userMapper.ListUser();
    }

    public int Update(User user){
        return userMapper.Update(user);
    }

//    public int delete(int id){
////        return userMapper.delete(id);
////    }
}

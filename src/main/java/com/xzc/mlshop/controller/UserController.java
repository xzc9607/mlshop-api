package com.xzc.mlshop.controller;

import com.xzc.mlshop.entity.Msg;
import com.xzc.mlshop.entity.User;
import com.xzc.mlshop.mapper.UserMapper;
import com.xzc.mlshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserController {

    @Autowired
    private UserService userservice;
    //获取用户列表
    @RequestMapping(value = "/getuserlist", method = RequestMethod.GET)
    public List<User> getuserlist() {
        return userservice.ListUser();
    }

    //登陆接口
    @RequestMapping(value="/login",method = RequestMethod.POST)
    @ResponseBody
    public Msg login(@RequestBody User user)
    {
        List<User> loginlist= userservice.findByName(user.getUsername());
        if(loginlist.size() != 0){
            User user1=loginlist.get(0);
            String pass=user1.getPassword();
            if(user.getPassword().equals(pass)){
                Msg msg=new Msg();
                msg.setCode(200);
                msg.setMsg("登陆成功");
                return msg;
            }else {
                Msg msg=new Msg();
                msg.setCode(201);
                msg.setMsg("密码错误");
                return msg;
            }

        }else{
            Msg msg=new Msg();
            msg.setCode(201);
            msg.setMsg("用户不存在");
            return msg;
        }


    }


    //注册接口
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public Msg register(@RequestBody User user)
    {
        System.out.println(userservice.register(user));
        Msg msg=new Msg();
        msg.setCode(201);
        msg.setMsg("注册成功");
        return msg;
    }

    //通过name查找用户
    @RequestMapping(value = "/finduserbyname", method = RequestMethod.GET)
    @ResponseBody
    public List<User> finduserbyname(String username){
        return userservice.findByName(username);

    }


//    @Autowired
//    //对数据库进行的删除操作
//    @RequestMapping(value = "/delete", method = RequestMethod.GET)
//    public String delete(int id) {
//        int result = userservice.delete(id);
//        if (result >= 1) {
//            return "删除成功";
//        } else {
//            return "删除失败";
//        }
//    }
    //对数据进行修改的操作
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(User user) {
        int result = userservice.Update(user);
        if (result >= 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }
    }
    //对数据库进行增加字段操作
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public User insert(User user)
    {
        return userservice.insertUser(user);
    }

}

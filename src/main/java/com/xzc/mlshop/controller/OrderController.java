package com.xzc.mlshop.controller;

import com.xzc.mlshop.entity.Car;
import com.xzc.mlshop.entity.Msg;
import com.xzc.mlshop.entity.Order;
import com.xzc.mlshop.mapper.OrderMapper;
import com.xzc.mlshop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private OrderService orderService;

    @RequestMapping(value="/getorderlistbyuserid",method = RequestMethod.GET)
    @ResponseBody
    public List<Order> getorderlistbyuserid(int userid){
        return orderMapper.getorderlistbyuserid(userid);
    }

    @RequestMapping(value="/getorderlistlength",method = RequestMethod.GET)
    @ResponseBody
    public int getorderlistlength(int userid){
        return orderMapper.getorderlistbyuserid(userid).size();
    }

    @RequestMapping(value = "/addorder", method = RequestMethod.POST)
    @ResponseBody
    public Msg addorder(@RequestBody Order order){
        orderService.addorder(order);
        Msg msg=new Msg();
        msg.setCode(201);
        msg.setMsg("提交成功");
        return msg;
    }
}

package com.xzc.mlshop.service;


import com.xzc.mlshop.entity.Order;
import com.xzc.mlshop.mapper.OrderMapper;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderMapper orderMapper;

    public List<Order> ListOrder(int userid){return orderMapper.getorderlistbyuserid(userid);}
    public Order addorder(Order order){orderMapper.addorder(order);return order;}
}


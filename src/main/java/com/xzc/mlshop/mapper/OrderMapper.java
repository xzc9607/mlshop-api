package com.xzc.mlshop.mapper;

import com.xzc.mlshop.entity.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {
    public List<Order> getorderlistbyuserid(int userid);
    public int addorder(Order order);

}

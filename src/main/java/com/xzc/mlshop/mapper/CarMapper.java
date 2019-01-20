package com.xzc.mlshop.mapper;

import com.xzc.mlshop.entity.Car;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface  CarMapper {
    public List<Car> getcarlist();
    public List<Car> getnewcarlist();
    public List<Car> findcarbyid(int id);
}

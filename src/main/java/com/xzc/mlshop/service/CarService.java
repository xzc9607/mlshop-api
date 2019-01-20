package com.xzc.mlshop.service;


import com.xzc.mlshop.entity.Car;
import com.xzc.mlshop.mapper.CarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    private CarMapper carMapper;

    public List<Car> ListCar(){return carMapper.getcarlist();}
    public List<Car> ListNewCar(){return carMapper.getnewcarlist();}
    public List<Car> findcarbyid(int id){return carMapper.findcarbyid(id);}
}

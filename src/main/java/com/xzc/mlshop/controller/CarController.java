package com.xzc.mlshop.controller;


import com.xzc.mlshop.entity.Car;
import com.xzc.mlshop.entity.Shop;
import com.xzc.mlshop.mapper.CarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {

    @Autowired
    private CarMapper CarMapper;

    @RequestMapping(value="/getcarlist",method = RequestMethod.GET)
    @ResponseBody
    public List<Car> getcar(){
        return CarMapper.getcarlist();
    }

    @RequestMapping(value="/getnewcarlist",method = RequestMethod.GET)
    @ResponseBody
    public List<Car> getnewcar(){
        return CarMapper.getnewcarlist();
    }

    @RequestMapping(value="/findcarbyid",method = RequestMethod.GET)
    @ResponseBody
    public List<Car> findcarbyid(int id){
        return CarMapper.findcarbyid(id);
    }


}

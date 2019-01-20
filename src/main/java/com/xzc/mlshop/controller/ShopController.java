package com.xzc.mlshop.controller;

import com.xzc.mlshop.entity.Shop;
import com.xzc.mlshop.mapper.ShopMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShopController {

    @Autowired
    private ShopMapper ShopMapper;

    @RequestMapping(value="/getshoplist",method = RequestMethod.GET)
    @ResponseBody
    public List<Shop> getshop(){
        return ShopMapper.getshoplist();
    }
}

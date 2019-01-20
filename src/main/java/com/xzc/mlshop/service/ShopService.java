package com.xzc.mlshop.service;


import com.xzc.mlshop.entity.Shop;
import com.xzc.mlshop.mapper.ShopMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopService {
    @Autowired
    private ShopMapper shopMapper;

    public List<Shop> ListShop(){return shopMapper.getshoplist();}
}

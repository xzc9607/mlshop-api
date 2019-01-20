package com.xzc.mlshop.mapper;


import com.xzc.mlshop.entity.Shop;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShopMapper {
    public List<Shop> getshoplist();
}

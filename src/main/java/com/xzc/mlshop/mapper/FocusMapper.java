package com.xzc.mlshop.mapper;

import com.xzc.mlshop.entity.Focus;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FocusMapper {
    public List<Focus> getfocuslistbyuserid(int userid);
    public int addfocuscar(Focus focus);
}

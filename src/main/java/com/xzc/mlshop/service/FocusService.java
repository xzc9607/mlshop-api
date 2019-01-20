package com.xzc.mlshop.service;

import com.xzc.mlshop.entity.Focus;
import com.xzc.mlshop.mapper.FocusMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FocusService {
    @Autowired
    private FocusMapper focusMapper;

    public List<Focus> ListFocus(int userid){return focusMapper.getfocuslistbyuserid(userid);}
    public Focus addfocuscar(Focus focus){focusMapper.addfocuscar(focus);return focus;}
}

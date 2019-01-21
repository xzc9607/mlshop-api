package com.xzc.mlshop.controller;

import com.xzc.mlshop.entity.Focus;
import com.xzc.mlshop.entity.Msg;
import com.xzc.mlshop.entity.Order;
import com.xzc.mlshop.mapper.FocusMapper;
import com.xzc.mlshop.service.FocusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FocusController {
    @Autowired
    private FocusMapper focusMapper;
    @Autowired
    private FocusService focusService;

    @RequestMapping(value="/getfocuslistbyuserid",method = RequestMethod.GET)
    @ResponseBody
    public List<Focus> getfocuslistbyuserid(int userid){
        return focusMapper.getfocuslistbyuserid(userid);
    }

    @RequestMapping(value="/getfocuslistlength",method = RequestMethod.GET)
    @ResponseBody
    public int getfocuslistlength(int userid){
        return focusMapper.getfocuslistbyuserid(userid).size();
    }

    @RequestMapping(value = "/addfocuscar", method = RequestMethod.POST)
    @ResponseBody
    public Msg addfocuscar(@RequestBody Focus focus){
        focusService.addfocuscar(focus);
        Msg msg=new Msg();
        msg.setCode(201);
        msg.setMsg("关注成功");
        return msg;
    }
}

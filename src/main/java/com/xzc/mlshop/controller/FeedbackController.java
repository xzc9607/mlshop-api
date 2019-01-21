package com.xzc.mlshop.controller;

import com.xzc.mlshop.entity.Feedback;
import com.xzc.mlshop.entity.Msg;
import com.xzc.mlshop.mapper.FeedbackMapper;
import com.xzc.mlshop.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FeedbackController {
    @Autowired
    private FeedbackService feedbackService;

    @Autowired
    private FeedbackMapper feedbackMapper;

    @RequestMapping(value = "/getfeedbacklist", method = RequestMethod.GET)
    public List<Feedback> getfeedbacklist(int userid){
        return feedbackService.getlistbyid(userid);
    }

    @RequestMapping(value = "/getfeedbacklistlength", method = RequestMethod.GET)
    public int getfeedbacklistlength(int userid){
        return feedbackService.getlistbyid(userid).size();
    }


    @RequestMapping(value = "/addfeedback", method = RequestMethod.POST)
    public Msg addfeedback(@RequestBody Feedback feedback){
        feedbackService.addfeedback(feedback);
        Msg msg=new Msg();
        msg.setCode(201);
        msg.setMsg("提交成功");
        return msg;
    }
}

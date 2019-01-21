package com.xzc.mlshop.service;


import com.xzc.mlshop.entity.Feedback;
import com.xzc.mlshop.mapper.FeedbackMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackService {
    @Autowired
    private FeedbackMapper feedbackMapper;

    public List<Feedback> getlistbyid(int userid){
        return feedbackMapper.getlistbyid(userid);
    }
    public Feedback addfeedback(Feedback feedback){feedbackMapper.addfeedback(feedback);return feedback;}
}

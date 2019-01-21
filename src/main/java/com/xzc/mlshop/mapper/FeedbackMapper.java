package com.xzc.mlshop.mapper;

import com.xzc.mlshop.entity.Feedback;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FeedbackMapper {
    List<Feedback> getlistbyid(int userid);
    public int addfeedback(Feedback feedback);

}

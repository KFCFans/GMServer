package com.lip.service.impl;

import com.lip.mapper.FeedbackMapper;
import com.lip.pojo.Feedback;
import com.lip.pojo.result.RequestResult;
import com.lip.service.FeedBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedBackServiceImpl implements FeedBackService {

    @Autowired
    public FeedbackMapper feedbackMapper;

    @Override
    public RequestResult commitFeedBack(Feedback feedback) {
        try {
            feedbackMapper.insertSelective(feedback);
        }catch (Exception e){
            return new RequestResult(500,"failed",e.getMessage());
        }
        return new RequestResult(200,"OK","反馈成功!");
    }
}

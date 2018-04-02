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

        return null;
    }
}

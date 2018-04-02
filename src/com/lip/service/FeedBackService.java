package com.lip.service;

import com.lip.pojo.Feedback;
import com.lip.pojo.result.RequestResult;

public interface FeedBackService {

    public RequestResult commitFeedBack(Feedback feedback);
}

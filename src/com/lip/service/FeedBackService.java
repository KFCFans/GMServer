package com.lip.service;

import com.lip.pojo.Feedback;
import com.lip.pojo.result.FeedbackListResult;
import com.lip.pojo.result.RequestResult;

public interface FeedBackService {

    public RequestResult commitFeedBack(Feedback feedback);

    // 获取未读的反馈信息
    public FeedbackListResult getFeedBack();

    // 获取已读的反馈信息
    public FeedbackListResult getReadFeedBack();

    // 已读信息
    public RequestResult readFeedBack(int fid);
}

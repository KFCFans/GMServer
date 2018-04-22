package com.lip.service;

import com.lip.pojo.result.RequestResult;

public interface ActivityService {

    // 发布活动
    public RequestResult releaseActivity(String avname,String avplace,String avstime,String avetime,String avdetail,String avpic);

}

package com.lip.service;

import com.lip.pojo.jspbean.MyActivityInfo;
import com.lip.pojo.result.ActivityListResult;
import com.lip.pojo.result.RequestResult;

import java.util.List;

public interface ActivityService {

    // 发布活动
    public RequestResult releaseActivity(String avname,String avplace,String avstime,String avetime,String avdetail,String avpic);

    // 获取活动列表
    public ActivityListResult getActivityList();

    // 获取活动列表（JSP特殊处理版）
    public List<MyActivityInfo> getActivityListForJSP();

    // 删除活动
    public RequestResult delActivity(int avid);

}

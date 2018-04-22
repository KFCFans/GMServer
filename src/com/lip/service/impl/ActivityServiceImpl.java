package com.lip.service.impl;

import com.lip.mapper.ActivityinfoMapper;
import com.lip.pojo.Activityinfo;
import com.lip.pojo.result.RequestResult;
import com.lip.service.ActivityService;
import com.lip.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivityServiceImpl implements ActivityService {

    @Autowired
    public ActivityinfoMapper activityinfoMapper;

    @Override
    public RequestResult releaseActivity(String avname, String avplace, String avstime, String avetime, String avdetail, String avpic) {
        Activityinfo activityinfo=new Activityinfo();
        activityinfo.setAvname(avname);
        activityinfo.setAvdetail(avdetail);
        activityinfo.setAvpic(avpic);
        activityinfo.setAvplace(avplace);

        // 将时间戳转化为时间
        activityinfo.setAvstime(CommonUtil.stampToDate(avstime));
        activityinfo.setAvetime(CommonUtil.stampToDate(avetime));
        try {
            activityinfoMapper.insertSelective(activityinfo);
        }catch (Exception e){
            return new RequestResult(500,"failed",e.getMessage());
        }
        return new RequestResult(200,"OK","发布成功!");
    }
}

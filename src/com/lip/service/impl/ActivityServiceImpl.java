package com.lip.service.impl;

import com.lip.mapper.ActivityinfoMapper;
import com.lip.pojo.Activityinfo;
import com.lip.pojo.ActivityinfoExample;
import com.lip.pojo.jspbean.MyActivityInfo;
import com.lip.pojo.result.ActivityListResult;
import com.lip.pojo.result.RequestResult;
import com.lip.service.ActivityService;
import com.lip.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    @Override
    public ActivityListResult getActivityList() {
        List<Activityinfo> list=null;
        ActivityinfoExample example=new ActivityinfoExample();
        ActivityinfoExample.Criteria criteria=example.createCriteria();
        criteria.andAvstimeGreaterThan(new Date());
        try {
            list=activityinfoMapper.selectByExample(example);
        }catch (Exception e){
            return new ActivityListResult(500,"failed",null);
        }
        return new ActivityListResult(200,"OK",list);
    }

    @Override
    public List<MyActivityInfo> getActivityListForJSP() {
        List<MyActivityInfo> res=new ArrayList<>();
        List<Activityinfo> list=getActivityList().getData();
        for(int i=0;i<list.size();i++){
            MyActivityInfo myActivityInfo=new MyActivityInfo();
            myActivityInfo.setAvdetail(list.get(i).getAvdetail());
            myActivityInfo.setAvid(list.get(i).getAvid());
            myActivityInfo.setAvname(list.get(i).getAvname());
            myActivityInfo.setAvpic(list.get(i).getAvpic());
            myActivityInfo.setAvplace(list.get(i).getAvplace());
            // 转化为人看得懂的时间
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日hh点mm分");
            myActivityInfo.setAvstime(simpleDateFormat.format(list.get(i).getAvstime()));
            myActivityInfo.setAvetime(simpleDateFormat.format(list.get(i).getAvetime()));

            res.add(myActivityInfo);
        }
        return res;
    }

    @Override
    public RequestResult delActivity(int avid) {
        try {
            activityinfoMapper.deleteByPrimaryKey(avid);
        }catch (Exception e){
            return new RequestResult(500,"failed",e.getMessage());
        }
        return new RequestResult(200,"OK","删除成功！");
    }
}

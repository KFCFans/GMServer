package com.lip.service.impl;

import com.lip.mapper.ViewpagerMapper;
import com.lip.pojo.Viewpager;
import com.lip.pojo.ViewpagerExample;
import com.lip.pojo.result.ViewpagerListResult;
import com.lip.service.ViewpagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViewpagerServiceImpl implements ViewpagerService {

    @Autowired
    public ViewpagerMapper viewpagerMapper;

    @Override
    public ViewpagerListResult getViewPager() {
        List<Viewpager> list=null;
        ViewpagerExample example=new ViewpagerExample();
        try {
            list=viewpagerMapper.selectByExample(example);
        }catch (Exception e){
            return new ViewpagerListResult(500,"failed",null);
        }
        return new ViewpagerListResult(200,"OK",list);
    }
}

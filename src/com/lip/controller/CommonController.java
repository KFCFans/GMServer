package com.lip.controller;

import com.lip.pojo.result.ActivityListResult;
import com.lip.pojo.result.AreaListResult;
import com.lip.pojo.result.ViewpagerListResult;
import com.lip.service.ActivityService;
import com.lip.service.AreaService;
import com.lip.service.ViewpagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/common")
public class CommonController {

    @Autowired
    private AreaService areaService;

    @Autowired
    private ViewpagerService viewpagerService;

    @Autowired
    private ActivityService activityService;

    @RequestMapping("/arealist")
    @ResponseBody
    public AreaListResult getAreaListInfo() {
        return areaService.getAreaList();
    }

    @RequestMapping("/vplist")
    @ResponseBody
    public ViewpagerListResult getViewPagerList(){
        return viewpagerService.getViewPager();
    }

    @RequestMapping("/avlist")
    @ResponseBody
    public ActivityListResult getActivityList(){
        return activityService.getActivityList();
    }

}

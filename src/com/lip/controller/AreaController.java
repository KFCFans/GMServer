package com.lip.controller;

import com.lip.pojo.result.AreaListResult;
import com.lip.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/area")
public class AreaController {

    @Autowired
    private AreaService areaService;

    @RequestMapping("/list")
    @ResponseBody
    public AreaListResult getAreaListInfo() {
        return areaService.getAreaList();
    }
}

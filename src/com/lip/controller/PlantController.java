package com.lip.controller;

import com.lip.pojo.Plantinfo;
import com.lip.pojo.result.PlantInfoResult;
import com.lip.pojo.result.PlantListResult;
import com.lip.pojo.result.RequestResult;
import com.lip.service.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/plant")
public class PlantController {

    @Autowired
    public PlantService plantService;

    @ResponseBody
    @RequestMapping("/list")
    public PlantListResult getPlantList(){
        return plantService.getPlantList();
    }

    @ResponseBody
    @RequestMapping("/info")
    public PlantInfoResult getPlantInfo(int pid){
        return plantService.getPlantInfo(pid);
    }

    @ResponseBody
    @RequestMapping("/add")
    public RequestResult addPlantInfo(Plantinfo plantinfo){
        return plantService.addPlantInfo(plantinfo);
    }
}

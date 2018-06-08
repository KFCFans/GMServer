package com.lip.service.impl;

import com.lip.mapper.PlantinfoMapper;
import com.lip.pojo.Plantinfo;
import com.lip.pojo.PlantinfoExample;
import com.lip.pojo.result.PlantInfoResult;
import com.lip.pojo.result.PlantListResult;
import com.lip.pojo.result.RequestResult;
import com.lip.service.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlantServiceImpl implements PlantService {

    @Autowired
    public PlantinfoMapper plantinfoMapper;

    @Override
    public PlantListResult getPlantList() {
        List<Plantinfo> list;
        PlantinfoExample example=new PlantinfoExample();
        try {
            list=plantinfoMapper.selectByExample(example);
        }catch (Exception e){
            return new PlantListResult(500,"failed",null);
        }
        return new PlantListResult(200,"OK",list);
    }

    @Override
    public List<Plantinfo> getPlantListForJSP() {
        List<Plantinfo> list=null;
        PlantinfoExample example=new PlantinfoExample();
        try {
            list=plantinfoMapper.selectByExample(example);
        }catch (Exception e){
            return null;
        }
        return list;
    }

    @Override
    public PlantInfoResult getPlantInfo(int pid) {
        Plantinfo plantinfo=null;
        try {
            plantinfo=plantinfoMapper.selectByPrimaryKey(pid);
        }catch (Exception e){
            return new PlantInfoResult(500,"failed",null);
        }
        return new PlantInfoResult(200,"OK",plantinfo);
    }

    @Override
    public RequestResult addPlantInfo(Plantinfo plantinfo) {
        try {
            plantinfoMapper.insertSelective(plantinfo);
        }catch (Exception e){
            return new RequestResult(500,"failed",e.getMessage());
        }
        return new RequestResult(20,"OK","success");
    }

    @Override
    public RequestResult delPlant(int pid) {
        try {
            plantinfoMapper.deleteByPrimaryKey(pid);
        }catch (Exception e){
            return new RequestResult(500,"failed",e.getMessage());
        }
        return new RequestResult(200,"OK","删除成功！");
    }
}

package com.lip.service;

import com.lip.pojo.Plantinfo;
import com.lip.pojo.result.PlantInfoResult;
import com.lip.pojo.result.PlantListResult;
import com.lip.pojo.result.RequestResult;

import java.util.List;

public interface PlantService {

    public PlantListResult getPlantList();

    public List<Plantinfo> getPlantListForJSP();

    public PlantInfoResult getPlantInfo(int pid);

    public RequestResult addPlantInfo(Plantinfo plantinfo);

    public RequestResult delPlant(int pid);


}

package com.lip.service;

import com.lip.pojo.Plantinfo;
import com.lip.pojo.result.PlantInfoResult;
import com.lip.pojo.result.PlantListResult;
import com.lip.pojo.result.RequestResult;

public interface PlantService {

    public PlantListResult getPlantList();

    public PlantInfoResult getPlantInfo(int pid);

    public RequestResult addPlantInfo(Plantinfo plantinfo);
}

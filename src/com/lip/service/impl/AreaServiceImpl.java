package com.lip.service.impl;

import com.lip.mapper.AreainfoMapper;
import com.lip.pojo.Areainfo;
import com.lip.pojo.AreainfoExample;
import com.lip.pojo.result.AreaListResult;
import com.lip.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    public AreainfoMapper areainfoMapper;

    @Override
    public AreaListResult getAreaList() {

        AreainfoExample example = new AreainfoExample();
        AreainfoExample.Criteria criteria=example.createCriteria();
        List<Areainfo> list= areainfoMapper.selectByExample(example);
        AreaListResult result=new AreaListResult(200,"OK",list);
        return result;
    }
}

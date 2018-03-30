package com.lip.mapper;

import com.lip.pojo.Plantinfo;
import com.lip.pojo.PlantinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlantinfoMapper {
    int countByExample(PlantinfoExample example);

    int deleteByExample(PlantinfoExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(Plantinfo record);

    int insertSelective(Plantinfo record);

    List<Plantinfo> selectByExample(PlantinfoExample example);

    Plantinfo selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") Plantinfo record, @Param("example") PlantinfoExample example);

    int updateByExample(@Param("record") Plantinfo record, @Param("example") PlantinfoExample example);

    int updateByPrimaryKeySelective(Plantinfo record);

    int updateByPrimaryKey(Plantinfo record);
}
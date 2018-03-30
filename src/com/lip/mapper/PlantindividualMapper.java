package com.lip.mapper;

import com.lip.pojo.Plantindividual;
import com.lip.pojo.PlantindividualExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlantindividualMapper {
    int countByExample(PlantindividualExample example);

    int deleteByExample(PlantindividualExample example);

    int deleteByPrimaryKey(Integer iid);

    int insert(Plantindividual record);

    int insertSelective(Plantindividual record);

    List<Plantindividual> selectByExample(PlantindividualExample example);

    Plantindividual selectByPrimaryKey(Integer iid);

    int updateByExampleSelective(@Param("record") Plantindividual record, @Param("example") PlantindividualExample example);

    int updateByExample(@Param("record") Plantindividual record, @Param("example") PlantindividualExample example);

    int updateByPrimaryKeySelective(Plantindividual record);

    int updateByPrimaryKey(Plantindividual record);
}
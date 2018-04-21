package com.lip.mapper;

import com.lip.pojo.Activityinfo;
import com.lip.pojo.ActivityinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityinfoMapper {
    int countByExample(ActivityinfoExample example);

    int deleteByExample(ActivityinfoExample example);

    int deleteByPrimaryKey(Integer avid);

    int insert(Activityinfo record);

    int insertSelective(Activityinfo record);

    List<Activityinfo> selectByExample(ActivityinfoExample example);

    Activityinfo selectByPrimaryKey(Integer avid);

    int updateByExampleSelective(@Param("record") Activityinfo record, @Param("example") ActivityinfoExample example);

    int updateByExample(@Param("record") Activityinfo record, @Param("example") ActivityinfoExample example);

    int updateByPrimaryKeySelective(Activityinfo record);

    int updateByPrimaryKey(Activityinfo record);
}
package com.lip.mapper;

import com.lip.pojo.Viewpager;
import com.lip.pojo.ViewpagerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ViewpagerMapper {
    int countByExample(ViewpagerExample example);

    int deleteByExample(ViewpagerExample example);

    int deleteByPrimaryKey(Integer vid);

    int insert(Viewpager record);

    int insertSelective(Viewpager record);

    List<Viewpager> selectByExample(ViewpagerExample example);

    Viewpager selectByPrimaryKey(Integer vid);

    int updateByExampleSelective(@Param("record") Viewpager record, @Param("example") ViewpagerExample example);

    int updateByExample(@Param("record") Viewpager record, @Param("example") ViewpagerExample example);

    int updateByPrimaryKeySelective(Viewpager record);

    int updateByPrimaryKey(Viewpager record);
}
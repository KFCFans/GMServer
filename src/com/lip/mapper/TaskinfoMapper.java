package com.lip.mapper;

import com.lip.pojo.Taskinfo;
import com.lip.pojo.TaskinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskinfoMapper {
    int countByExample(TaskinfoExample example);

    int deleteByExample(TaskinfoExample example);

    int deleteByPrimaryKey(Integer tid);

    int insert(Taskinfo record);

    int insertSelective(Taskinfo record);

    List<Taskinfo> selectByExample(TaskinfoExample example);

    Taskinfo selectByPrimaryKey(Integer tid);

    int updateByExampleSelective(@Param("record") Taskinfo record, @Param("example") TaskinfoExample example);

    int updateByExample(@Param("record") Taskinfo record, @Param("example") TaskinfoExample example);

    int updateByPrimaryKeySelective(Taskinfo record);

    int updateByPrimaryKey(Taskinfo record);
}
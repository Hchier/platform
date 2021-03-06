package com.platform.mapper;

import com.platform.entity.Project;
import com.platform.entity.Team;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ProjectMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Project record);

    Project selectByPrimaryKey(Integer id);

    List<Project> selectAll();

    int updateByPrimaryKey(Project record);


    List<Team> getTeamInfoByProjectId(Integer id);


    String selectNameById(Integer id);
}
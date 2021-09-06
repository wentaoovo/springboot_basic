package com.trkj.crmproject.dao.wentao;

import com.trkj.crmproject.entity.wentao.Indent;

import java.util.List;

public interface IndentDao {
    int deleteByPrimaryKey(String id);

    int insert(Indent record);

    int insertSelective(Indent record);

    Indent selectByPrimaryKey(String id);

    List<Indent> selectAll();

    int updateByPrimaryKeySelective(Indent record);

    int updateByPrimaryKey(Indent record);
}
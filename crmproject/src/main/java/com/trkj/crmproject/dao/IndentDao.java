package com.trkj.crmproject.dao;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.trkj.crmproject.entity.Indent;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.trkj.crmproject.vo.Indent.SearchListVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author MarkerHub
 * @since 2021-07-29
 */

public interface IndentDao extends BaseMapper<Indent> {
    IPage<Indent> selectList(IPage<Indent> page,@Param(Constants.WRAPPER) Wrapper wrapper);
}

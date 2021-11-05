package com.trkj.crmproject.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.trkj.crmproject.entity.Indent;
import com.baomidou.mybatisplus.extension.service.IService;
import com.trkj.crmproject.vo.Indent.SearchListVo;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author MarkerHub
 * @since 2021-07-29
 */
public interface IndentService extends IService<Indent> {
    boolean add(Indent indent);
    IPage<Indent> findList(SearchListVo searchListVo);
}

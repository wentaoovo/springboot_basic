package com.trkj.crmproject.service.wentao;

import com.github.pagehelper.PageInfo;
import com.trkj.crmproject.entity.wentao.Indent;

import java.util.List;

public interface IndentService {
    PageInfo<Indent> selectAll();
}

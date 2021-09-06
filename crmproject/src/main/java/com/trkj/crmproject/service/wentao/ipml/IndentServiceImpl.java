package com.trkj.crmproject.service.wentao.ipml;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.crmproject.dao.wentao.IndentDao;
import com.trkj.crmproject.entity.wentao.Indent;
import com.trkj.crmproject.service.wentao.IndentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IndentServiceImpl implements IndentService {
    @Autowired
    private IndentDao indentDao;
    @Override
    public PageInfo<Indent> selectAll() {
        PageHelper.startPage(1,2);
        return new PageInfo<Indent>(indentDao.selectAll());
    }
}

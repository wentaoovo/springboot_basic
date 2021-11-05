package com.trkj.crmproject.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.trkj.crmproject.entity.Indent;
import com.trkj.crmproject.dao.IndentDao;
import com.trkj.crmproject.service.IndentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.trkj.crmproject.util.IdWorker;
import com.trkj.crmproject.vo.Indent.SearchListVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 *订单表业务
 * @author MarkerHub
 * @since 2021-07-29
 */
@Service
public class IndentServiceImpl extends ServiceImpl<IndentDao, Indent> implements IndentService {
    @Autowired
    private IdWorker idWorker;
    @Autowired
    private IndentDao indentDao;
    /**
     * 新增订单
     */
    public boolean add(Indent indent){
        indent.setId(idWorker.nextId()+"");
        indent.setAddTime(LocalDateTime.now());
        indent.setTotalMoney(BigDecimal.valueOf(0));
        indent.setIndentDate(LocalDate.now());
        indent.setOutMoney(BigDecimal.valueOf(0));
        indent.setReturnedMoney(BigDecimal.valueOf(0));
        indent.setCost(BigDecimal.valueOf(0));
        indent.setDiscount(BigDecimal.valueOf(0));
        indent.setGrossMargin(BigDecimal.valueOf(0));
        indent.setForgrossMargin(BigDecimal.valueOf(0));
        indent.setInvoiceValue(BigDecimal.valueOf(0));
        indent.setFreight(BigDecimal.valueOf(0));
        indent.setTimeLiness(0);
        boolean save =save(indent);
        return save;
    }
    /**
     * 查询订单列表
     * @param searchListVo
     * @return
     */
    @Override
    public IPage<Indent> findList(SearchListVo searchListVo) {
        if (searchListVo.getPageNum()==null){
            searchListVo.setPageNum(1);
        }
        if (searchListVo.getPageSize()==null){
            searchListVo.setPageSize(10);
        }
        Page<Indent> page=new Page<>(searchListVo.getPageNum(),searchListVo.getPageSize());
        QueryWrapper<Indent> wrapper=new QueryWrapper<>();
        if (searchListVo.getCustomerName()!=null){
            wrapper.like("customer_name",searchListVo.getCustomerName());
        }
        if (searchListVo.getPossessor()!=null){
            wrapper.like("possessor",searchListVo.getPossessor());
        }
        if (searchListVo.getClassify()!=null){
            wrapper.eq("classify",searchListVo.getClassify());
        }
        if (searchListVo.getState()!=null){
            wrapper.eq("state",searchListVo.getState());
        }
        if (searchListVo.getKeyword()!=null){
            wrapper.like("CONCAT(id,theme,customer_name)",searchListVo.getKeyword());
        }
        wrapper.eq("TimeLiness",0);
        IPage<Indent> indentIPage = indentDao.selectList(page,wrapper);
        return indentIPage;
    }
}

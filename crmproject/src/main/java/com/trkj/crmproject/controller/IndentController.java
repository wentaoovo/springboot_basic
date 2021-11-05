package com.trkj.crmproject.controller;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.trkj.crmproject.entity.Indent;
import com.trkj.crmproject.enums.ResultEnum;
import com.trkj.crmproject.service.IndentService;
import com.trkj.crmproject.util.IdWorker;
import com.trkj.crmproject.util.ResultVoUtil;
import com.trkj.crmproject.vo.Indent.SearchListVo;
import com.trkj.crmproject.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author MarkerHub
 * @since 2021-07-29
 */
@RestController
@RequestMapping("/indent")
public class IndentController {
    @Autowired
    private IndentService indentService;

    /**
     * 新增订单
     * @param indent
     * @return
     */
    @PostMapping("/add")
    public ResultVo add(@Validated @RequestBody Indent indent){
        if (indentService.add(indent)){
            return ResultVoUtil.success();
        }
        return ResultVoUtil.error(ResultEnum.ADD_ERROR);
    }

    /**
     * 删除订单
     * @param id
     * @return
     */
    @DeleteMapping("/delete/{id}")
    public ResultVo delete(@PathVariable("id") String id){
        if (indentService.removeById(id)){
            return ResultVoUtil.success();
        }
        return ResultVoUtil.error(ResultEnum.DELETE_ERROR);
    }

    /**
     * 更新订单
     * @param id
     * @param indent
     * @return
     */
    @PutMapping("/update/{id}")
    public ResultVo delete(@PathVariable("id") String id,@Validated @RequestBody Indent indent){
        indent.setId(id);
        if (indentService.saveOrUpdate(indent)){
            return ResultVoUtil.success();
        }
        return ResultVoUtil.error(ResultEnum.UPDATE_ERROR);
    }

    /**
     * 查询订单
     * @param id
     * @return
     */
    @GetMapping("/find/{id}")
    public ResultVo find(@PathVariable("id") String id){
        return ResultVoUtil.success();
    }
    /**
     * 查询订单列表
     * @return
     */
    @GetMapping("/list")
    public ResultVo findList(@RequestBody SearchListVo searchListVo){
        IPage<Indent> list = indentService.findList(searchListVo);
        return ResultVoUtil.success(list);
    }
}

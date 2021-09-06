package com.trkj.crmproject.controller.wentao;

import com.github.pagehelper.PageInfo;
import com.trkj.crmproject.entity.wentao.Indent;
import com.trkj.crmproject.service.wentao.IndentService;
import com.trkj.crmproject.util.ResultVoUtil;
import com.trkj.crmproject.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/indent")
public class IndentDaoController {
    @Resource
    private IndentService indentService;
    @GetMapping("/all")
    public ResultVo selectAll(){
        PageInfo<Indent> all = indentService.selectAll();
        return ResultVoUtil.success(all);
    }
}

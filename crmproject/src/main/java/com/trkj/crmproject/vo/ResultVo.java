package com.trkj.crmproject.vo;

import lombok.Data;

@Data
public class ResultVo {
    private Boolean Success;

    private Integer code;

    private String message;

    private Object Data;
}

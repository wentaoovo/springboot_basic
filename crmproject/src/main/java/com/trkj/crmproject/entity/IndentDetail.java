package com.trkj.crmproject.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author MarkerHub
 * @since 2021-08-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class IndentDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 明细ID
     */
    private String id;

    /**
     * 订单ID
     */
    private String indentId;

    /**
     * 产品ID
     */
    private String productId;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 单价
     */
    private BigDecimal unitPrice;

    /**
     * 金额
     */
    private BigDecimal money;

    /**
     * 产品数量
     */
    private Integer quantity;

    /**
     * 型号
     */
    private String model;

    /**
     * 折扣
     */
    private BigDecimal discount;

    /**
     * 备注
     */
    private String remark;

    /**
     * 增加人
     */
    @TableField("AddName")
    private String AddName;

    /**
     * 增加时间
     */
    @TableField("AddTime")
    private LocalDateTime AddTime;

    /**
     * 修改人
     */
    @TableField("UpdateName")
    private String UpdateName;

    /**
     * 最后修改时间
     */
    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    /**
     * 删除人
     */
    @TableField("DeleteName")
    private String DeleteName;

    /**
     * 删除时间
     */
    @TableField("DeleteTime")
    private LocalDateTime DeleteTime;

    /**
     * 时效性
     */
    @TableField("TimeLiness")
    private Integer TimeLiness;


}

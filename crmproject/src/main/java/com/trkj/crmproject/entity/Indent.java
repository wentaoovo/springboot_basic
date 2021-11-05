package com.trkj.crmproject.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * <p>
 * 
 * </p>
 *
 * @author MarkerHub
 * @since 2021-07-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Indent implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单号ID
     */
    //@TableId(type = IdType.ASSIGN_ID)
    private String id;

    /**
     * 主题
     */
    @NotBlank(message = "主题不能为空")
    private String theme;

    /**
     * 分类
     */
    private String classify;

    /**
     * 对应客户ID
     */
    private String customerId;

    /**
     * 对应客户名称
     */
    @NotBlank(message = "客户名称不能为空")
    private String customerName;

    /**
     * 对应机会ID
     */
    private String chanceId;

    /**
     * 对应机会名称
     */
    private String chanceName;

    /**
     * 总金额
     */
        private BigDecimal totalMoney;

    /**
     * 订单日期
     */
    private LocalDate indentDate;

    /**
     * 最晚发货日期
     */
    private LocalDate latestDeliveryDate;

    /**
     * 客户签约人ID
     */
    private String contactsId;

    /**
     * 客户签约人姓名
     */
    @NotBlank(message = "客户签约人不能为空")
    private String contactsName;

    /**
     * 备注
     */
    private String remark;

    /**
     * 发货金额
     */
    private BigDecimal outMoney;

    /**
     * 回款金额
     */
    private BigDecimal returnedMoney;

    /**
     * 总成本
     */
    private BigDecimal cost;

    /**
     * 总折扣
     */
    private BigDecimal discount;

    /**
     * 毛利
     */
    private BigDecimal grossMargin;

    /**
     * 预估毛利
     */
    private BigDecimal forgrossMargin;

    /**
     * 开发票金额
     */
    private BigDecimal invoiceValue;

    /**
     * 运费
     */
    private BigDecimal freight;

    /**
     * 订单所有者ID
     */
    private String possessorId;

    /**
     * 订单所有者
     */
    private String possessor;

    /**
     * 状态   0执行中,1结束,2意外中止
     */
    private Integer state;

    /**
     * 收件人姓名
     */
    private String addressee;

    /**
     * 收件人电话
     */
    private String addresseeTelephone;

    /**
     * 收件人移动电话
     */
    @Pattern(regexp = "^(13[0-9]|14[579]|15[0-3,5-9]|16[6]|17[0135678]|18[0-9]|19[89])\\d{8}$",message = "手机号码有误！")
    private String addresseePhone;

    /**
     * 省区
     */
    private String province;

    /**
     * 城市
     */
    private String city;

    /**
     * 地址类型
     */
    private String addressType;

    /**
     * 收货人地址
     */
    private String addresseeSite;

    /**
     * 邮编
     */
    private String postcode;

    /**
     * 增加人
     */
    @TableField("AddName")
    private String AddName;

    /**
     * 增加时间
     */
    @TableField(value = "AddTime",fill = FieldFill.INSERT)
    private LocalDateTime AddTime;

    /**
     * 修改人
     */
    @TableField("UpdateName")
    private String UpdateName;

    /**
     * 最后修改时间
     */
    @TableField(value = "UpdateTime",fill = FieldFill.INSERT_UPDATE)
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
    @TableLogic
    private Integer TimeLiness;


}

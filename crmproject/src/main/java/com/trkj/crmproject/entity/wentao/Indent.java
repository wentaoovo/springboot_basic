package com.trkj.crmproject.entity.wentao;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * indent
 * @author 
 */
@Data
public class Indent implements Serializable {
    /**
     * 订单号ID
     */
    private String id;

    /**
     * 主题
     */
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
    private Date indentDate;

    /**
     * 最晚发货日期
     */
    private Date latestDeliveryDate;

    /**
     * 客户签约人ID
     */
    private String contactsId;

    /**
     * 客户签约人姓名
     */
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
     * 状态
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
    private String addname;

    /**
     * 增加时间
     */
    private Date addtime;

    /**
     * 修改人
     */
    private String updatename;

    /**
     * 最后修改时间
     */
    private Date updatetime;

    /**
     * 删除人
     */
    private String deletename;

    /**
     * 删除时间
     */
    private Date deletetime;

    /**
     * 时效性
     */
    private Integer timeliness;

    private static final long serialVersionUID = 1L;
}
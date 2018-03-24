package com.pay.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by yz on 2018/03/24.
 */
public class PayOrder {

    private Integer id;
    // 订单ID
    private String orderId;
    // 充值金额
    private BigDecimal amountMoney;
    // 交易来源
    private String source;
    // 用户ID
    private String userId;
    // 交易状态
    private String state;
    // 交易报文
    private String transactionMessage;
    // 创建时间
    private Date createDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getAmountMoney() {
        return amountMoney;
    }

    public void setAmountMoney(BigDecimal amountMoney) {
        this.amountMoney = amountMoney;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTransactionMessage() {
        return transactionMessage;
    }

    public void setTransactionMessage(String transactionMessage) {
        this.transactionMessage = transactionMessage;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "PayOrder{" +
                "id=" + id +
                ", orderId='" + orderId + '\'' +
                ", amountMoney=" + amountMoney +
                ", source='" + source + '\'' +
                ", userId='" + userId + '\'' +
                ", state='" + state + '\'' +
                ", transactionMessage='" + transactionMessage + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}

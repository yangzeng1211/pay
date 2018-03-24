package com.pay.service;

import com.pay.entity.PayOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by yz on 2018/03/24.
 */
@Service
public class PayOrderServiceImpl implements PayOrderService{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int saveOrder(PayOrder payOrder) {
        String sql = "insert into pay_order values (?,?,?,?,?,?,?,?)";
        int result = jdbcTemplate.update(sql,
                new Object[]{payOrder.getId(),payOrder.getOrderId(),payOrder.getAmountMoney(),payOrder.getSource(),
                payOrder.getUserId(),payOrder.getTransactionMessage(),payOrder.getState(),new Date()});
        return result;
    }
}

package com.pay.controller;

import com.pay.entity.PayOrder;
import com.pay.service.PayOrderService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 收银台项目
 * Created by yz on 2018/03/22.
 */
@RequestMapping("/pay")
@RestController
public class PayController {

    private final Logger logger = Logger.getLogger(PayController.class);

    @Autowired
    private PayOrderService payOrderService;

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/save")
    public String save(String userId){
        PayOrder payOrder = new PayOrder();
        payOrder.setAmountMoney(new BigDecimal(22.22));
        payOrder.setUserId(userId);
        payOrder.setOrderId(System.currentTimeMillis()+userId);
        payOrder.setSource("1");
        payOrder.setState("0");
        payOrder.setCreateDate(new Date());
        return payOrderService.saveOrder(payOrder)+"";
    }
}

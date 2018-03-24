# pay
支付项目

CREATE TABLE pay_order(
  id INT(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  orderId VARCHAR(100) DEFAULT NULL COMMENT '订单Id',
  amountMoney DECIMAL(10,2) DEFAULT NULL COMMENT '金额',
  source VARCHAR(200) DEFAULT NULL COMMENT '来源 1.mustpay 支付',
  userId VARCHAR(50) DEFAULT NULL COMMENT '用户Id',
  transactionMessage VARCHAR(5000) DEFAULT NULL COMMENT '交易报文',
  state VARCHAR(2) DEFAULT NULL COMMENT '0 待支付 1 支付成功 2 支付失败',
  createDate VARCHAR(100) DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY(id)
)ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='订单支付信息表'


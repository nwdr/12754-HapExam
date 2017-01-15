package com.hand.hap.orders.service;

import com.hand.hap.orders.dto.OrderInfo;

import java.util.List;

/**
 * Created by 女王大人 on 2017/1/15.
 */
public interface IOrderInfoService {

    List<OrderInfo> getOrderInfos(OrderInfo orderInfo);

}

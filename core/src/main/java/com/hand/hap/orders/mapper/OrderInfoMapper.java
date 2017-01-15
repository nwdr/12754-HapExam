package com.hand.hap.orders.mapper;

import com.hand.hap.orders.dto.OrderInfo;

import java.util.List;

/**
 * Created by 女王大人 on 2017/1/15.
 */
public interface OrderInfoMapper {

    public List<OrderInfo> selectOrderInfo(OrderInfo orderInfo);

}

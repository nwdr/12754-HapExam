package com.hand.hap.orders.service.Impl;

import com.hand.hap.orders.dto.OrderInfo;
import com.hand.hap.orders.mapper.OrderInfoMapper;
import com.hand.hap.orders.service.IOrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 女王大人 on 2017/1/15.
 */
@Service
public class OrderInfoService implements IOrderInfoService {

    @Autowired
    private OrderInfoMapper orderInfoMapper;

    @Override
    public List<OrderInfo> getOrderInfos(OrderInfo orderInfo) {
        return orderInfoMapper.selectOrderInfo(orderInfo);
    }
}

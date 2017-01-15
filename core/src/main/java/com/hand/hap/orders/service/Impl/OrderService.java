package com.hand.hap.orders.service.Impl;

import com.hand.hap.orders.mapper.OrderStatusMapper;
import com.hand.hap.orders.service.IOrderService;
import com.hand.hap.system.dto.CodeValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 女王大人 on 2017/1/15.
 */
@Service
public class OrderService implements IOrderService {

    @Autowired
    private OrderStatusMapper orderStatusMapper;

    @Override
    public List<CodeValue> getOrderStatus() {
        return orderStatusMapper.selectMeaningByCodeId();
    }

}

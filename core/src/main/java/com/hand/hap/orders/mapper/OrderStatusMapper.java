package com.hand.hap.orders.mapper;

import com.hand.hap.system.dto.CodeValue;

import java.util.List;

/**
 * Created by 女王大人 on 2017/1/15.
 */
public interface OrderStatusMapper {
    List<CodeValue> selectMeaningByCodeId();
}

package com.hand.hap.orders.mapper;

import com.hand.hap.mybatis.common.Mapper;
import com.hand.hap.orders.dto.Items;

import java.util.List;

/**
 * Created by 女王大人 on 2017/1/14.
 */
public interface ItemsMapper extends Mapper<Items> {

    List<Items> selectItems(Items items);

}

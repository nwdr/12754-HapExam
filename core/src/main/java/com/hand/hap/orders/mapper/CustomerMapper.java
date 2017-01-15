package com.hand.hap.orders.mapper;

import com.hand.hap.fnd.dto.Company;
import com.hand.hap.mybatis.common.Mapper;
import com.hand.hap.orders.dto.Customer;
import com.hand.hap.orders.dto.HapOrgCompanys;

import java.util.List;

/**
 * Created by 女王大人 on 2017/1/14.
 */
public interface CustomerMapper extends Mapper<Customer> {

    List<Customer> selectCustomerByCompanyId(Customer customer);

}

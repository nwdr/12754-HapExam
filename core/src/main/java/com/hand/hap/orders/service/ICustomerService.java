package com.hand.hap.orders.service;

import com.hand.hap.orders.dto.Customer;
import com.hand.hap.orders.dto.HapOrgCompanys;

import java.util.List;

/**
 * Created by 女王大人 on 2017/1/14.
 */
public interface ICustomerService {

    List<Customer> getCustomers(Customer customer);

}

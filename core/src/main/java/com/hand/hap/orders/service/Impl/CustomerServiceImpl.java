package com.hand.hap.orders.service.Impl;

import com.hand.hap.fnd.dto.Company;
import com.hand.hap.orders.dto.Customer;
import com.hand.hap.orders.dto.HapOrgCompanys;
import com.hand.hap.orders.mapper.CustomerMapper;
import com.hand.hap.orders.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 女王大人 on 2017/1/14.
 */
@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public List<Customer> getCustomers(Customer customer) {
        return customerMapper.selectCustomerByCompanyId(customer);
    }
}

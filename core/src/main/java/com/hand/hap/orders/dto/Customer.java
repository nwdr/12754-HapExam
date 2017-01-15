package com.hand.hap.orders.dto;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Created by 女王大人 on 2017/1/13.
 */
@Table(name="hap_ar_customers")
public class Customer {

    @Id
    @GeneratedValue
    @Column
    @NotNull
    private Long customerId;

    @Column
    @NotEmpty
    private String customerNumber;

    @Column
    @NotEmpty
    private String customerName;

    @Column
    @NotNull
    private Long companyId;

    public Customer() { }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

}

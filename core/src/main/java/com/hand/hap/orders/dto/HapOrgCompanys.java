package com.hand.hap.orders.dto;

import com.hand.hap.system.dto.BaseDTO;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by 女王大人 on 2017/1/13.
 */
@Table(name = "hap_org_companys")
public class HapOrgCompanys {

    @Id
    @Column
    @GeneratedValue
    @NotNull
    private Long companyId;

    @Column
    @NotEmpty
    private String companyNumber;

    @Column
    @NotEmpty
    private String companyName;

    @Column
    private String enabledFLag;

    @Column
    @NotEmpty
    private Date companyDate;

    @Column
    private Long createdBy;

    @Column
    private Long lastUpdatedBy;

    @Column
    private Date lastUpdatedDate;

    @Column
    private Long lastUpdatedLogin;

    public HapOrgCompanys() {}

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getCompanyNumber() {
        return companyNumber;
    }

    public void setCompanyNumber(String companyNumber) {
        this.companyNumber = companyNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEnabledFLag() {
        return enabledFLag;
    }

    public void setEnabledFLag(String enabledFLag) {
        this.enabledFLag = enabledFLag;
    }

    public Date getCompanyDate() {
        return companyDate;
    }

    public void setCompanyDate(Date companyDate) {
        this.companyDate = companyDate;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Long getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(Long lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public Long getLastUpdatedLogin() {
        return lastUpdatedLogin;
    }

    public void setLastUpdatedLogin(Long lastUpdatedLogin) {
        this.lastUpdatedLogin = lastUpdatedLogin;
    }

}

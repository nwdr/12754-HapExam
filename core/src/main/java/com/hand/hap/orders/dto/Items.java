package com.hand.hap.orders.dto;

import com.hand.hap.core.annotation.MultiLanguageField;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Created by 女王大人 on 2017/1/13.
 */
@Table(name="hap_inv_inventory_items")
public class Items {

    @Id
    @GeneratedValue
    @Column
    @NotNull
    @MultiLanguageField
    private Long inventoryItemId;

    @Column
    @NotEmpty
    @MultiLanguageField
    private String itemCode;

    @Column
    @MultiLanguageField
    private String itemUom;

    @Column
    @NotEmpty
    @MultiLanguageField
    private String itemDescription;

    public Items() {}

    public Long getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(Long inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemUom() {
        return itemUom;
    }

    public void setItemUom(String itemUom) {
        this.itemUom = itemUom;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

}


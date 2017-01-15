package com.hand.hap.orders.controllers;

import com.hand.hap.core.IRequest;
import com.hand.hap.orders.dto.Customer;
import com.hand.hap.orders.dto.HapOrgCompanys;
import com.hand.hap.orders.dto.OrderInfo;
import com.hand.hap.orders.service.ICustomerService;
import com.hand.hap.orders.service.IOrderInfoService;
import com.hand.hap.orders.service.IOrderService;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.CodeValue;
import com.hand.hap.system.dto.ResponseData;
import com.hand.hap.system.service.ICodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by 女王大人 on 2017/1/14.
 */
@Controller
@RequestMapping(path = "/orders")
public class OrderController extends BaseController{

    @Autowired
    private IOrderService orderService;
    @Autowired
    private IOrderInfoService orderInfoService;

    public OrderController() {}

    @RequestMapping(path = "/findOrderStatus",method = RequestMethod.POST)
    public List<CodeValue> getOrderStatus() {
        List<CodeValue> orderStatus = this.orderService.getOrderStatus();
        return orderStatus;
    }

    //订单汇总查询
    @RequestMapping(path="/findOrderInfos",method = RequestMethod.GET)
    public ResponseData getOrderInfo(
            @RequestParam(name="companyId",required = false,defaultValue = "") String companyId,
            @RequestParam(name="customerId",required = false,defaultValue = "")String customerId,
            @RequestParam(name="orderNumber",required = false,defaultValue = "") String orderNumber,
            @RequestParam(name="itemId",required = false,defaultValue = "") String itemId,
            @RequestParam(name="orderStatus",required = false,defaultValue = "") String orderStatus){
        ResponseData responseData = new ResponseData();
        OrderInfo orderInfo = new OrderInfo();

        if(isNumeric(companyId))
            orderInfo.setCompanyId(parseToLong(companyId));

        if(isNumeric(customerId))
            orderInfo.setCustomerId(parseToLong(customerId));

        orderInfo.setOrderNumber(orderNumber);

        if(isNumeric(itemId))
            orderInfo.setInventoryItemId(parseToLong(itemId));

        if(!orderStatus.equals(""))
            orderInfo.setOrderStatus(orderStatus);

        List<OrderInfo> orderInfos = orderInfoService.getOrderInfos(orderInfo);

        responseData.setRows(orderInfos);
        responseData.setTotal(Long.valueOf(orderInfos.size()));

        return responseData;
    }

    private static Long parseToLong(String str){
        System.out.println(str);
        return Long.parseLong(str);
    }

    public static boolean isNumeric(String str){
        if(str.equals(""))
            return false;
        for (int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i));
            if (!Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }

}

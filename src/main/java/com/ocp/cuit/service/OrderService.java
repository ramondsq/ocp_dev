package com.ocp.cuit.service;

import com.ocp.cuit.vo.RetailerGetAllOrdersVO;
import com.ocp.cuit.vo.SubmitOrderReviewVO;
import com.ocp.cuit.vo.SubmitStockOrderVO;
import com.ocp.cuit.vo.SubmitWSOrderVO;

import java.util.Map;

public interface OrderService {
    Map<String, Object> submitStockOrder(SubmitStockOrderVO submitStockOrderVO);
    Map<String, Object> submitWSOrder(SubmitWSOrderVO submitWSOrderVO);
    Map<String, Object> getOrders(RetailerGetAllOrdersVO retailerGetAllOrdersVO);
    Map<String, Object> getRetailOrderRtr(String rtlog_user_name);
    Map<String, Object> submitOrderReview(SubmitOrderReviewVO submitOrderReviewVO);
    Map<String, Object> cancelOrder(String order_number);
}

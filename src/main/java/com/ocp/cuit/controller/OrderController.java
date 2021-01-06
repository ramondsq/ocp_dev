package com.ocp.cuit.controller;

import com.ocp.cuit.service.OrderService;
import com.ocp.cuit.vo.RetailerGetAllOrdersVO;
import com.ocp.cuit.vo.SubmitOrderReviewVO;
import com.ocp.cuit.vo.SubmitStockOrderVO;
import com.ocp.cuit.vo.SubmitWSOrderVO;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@CrossOrigin
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;

    @RequestMapping("/submitStockOrder")
    public Map<String, Object> submitStockOrder(@RequestBody SubmitStockOrderVO submitStockOrderVO) {
        return orderService.submitStockOrder(submitStockOrderVO);
    }

    @RequestMapping("/submitWSOrder")
    public Map<String, Object> submitWSOrder(@RequestBody SubmitWSOrderVO submitWSOrderVO) {
        return orderService.submitWSOrder(submitWSOrderVO);
    }

    @RequestMapping("/getOrders")
    public Map<String, Object> getOrders(RetailerGetAllOrdersVO retailerGetAllOrdersVO) {
        return orderService.getOrders(retailerGetAllOrdersVO);
    }

    @RequestMapping("/getRetailOrderRtr")
    public Map<String, Object> getRetailOrderRtr(String rtlog_user_name) {
        return orderService.getRetailOrderRtr(rtlog_user_name);
    }

    @RequestMapping("/submitOrderReview")
    public Map<String, Object> submitOrderReview(SubmitOrderReviewVO submitOrderReviewVO) {
        return orderService.submitOrderReview(submitOrderReviewVO);
    }

    @RequestMapping("/cancelOrder")
    public Map<String, Object> cancelOrder(String order_number) {
        return orderService.cancelOrder(order_number);
    }
}

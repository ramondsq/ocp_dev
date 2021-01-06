package com.ocp.cuit.controller;

import com.ocp.cuit.service.OrderService;
import com.ocp.cuit.vo.*;
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

    /*-----以下为经销商部分-----*/

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


    /*-----以下为运营部分-----*/
    @RequestMapping("/getReviewOrders")
    public Map<String ,Object> getReviewOrders(Integer status) {
        return orderService.getReviewOrders(status);
    }

    @RequestMapping("/inquireStockOrders")
    public Map<String, Object> inquireStockOrders(InquireOrdersVO inquireOrdersVO) {
        return orderService.inquireStockOrders(inquireOrdersVO);
    }

    @RequestMapping("/inquireWSOrders")
    public Map<String, Object> inquireWSOrders(InquireOrdersVO inquireOrdersVO) {
        return orderService.inquireWSOrders(inquireOrdersVO);
    }

    @RequestMapping("/reviewStockOrder")
    public Map<String, Object> reviewStockOrder(ReviewOrderVO reviewOrderVO) {
        return orderService.reviewStockOrder(reviewOrderVO);
    }

    @RequestMapping("/reviewWSOrder")
    public Map<String, Object> reviewWSOrder(ReviewOrderVO reviewOrderVO) {
        return orderService.reviewWSOrder(reviewOrderVO);
    }

    @RequestMapping("/getOrderDetail")
    public Map<String, Object> getOrderDetail(String order_number) {
        return orderService.getOrderDetail(order_number);
    }

    @RequestMapping("/getAllRetailOrders")
    public Map<String, Object> getAllRetailOrders() {
        return orderService.getAllRetailOrders();
    }
}

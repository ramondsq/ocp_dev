package com.ocp.cuit.controller;

import com.ocp.cuit.pojo.StockOrder;
import com.ocp.cuit.service.OrderService;
import com.ocp.cuit.vo.SubmitStockOrderVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class OrderController {
    @Resource
    private OrderService orderService;

    @RequestMapping("/submitStockOrder")
    public Map<String, Object> submitStockOrder(@RequestBody SubmitStockOrderVO submitStockOrderVO) {
        return orderService.submitStockOrder(submitStockOrderVO);
    }
}

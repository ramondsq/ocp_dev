package com.ocp.cuit.service;

import com.ocp.cuit.vo.SubmitStockOrderVO;

import java.util.Map;

public interface OrderService {
    Map<String, Object> submitStockOrder(SubmitStockOrderVO submitStockOrderVO);
}

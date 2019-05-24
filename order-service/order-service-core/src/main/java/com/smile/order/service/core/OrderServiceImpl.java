package com.smile.order.service.core;


import com.smile.order.service.api.OrderService;
import com.smile.order.service.db.domain.Order;
import com.smile.order.service.db.reposity.OrderReposity;
import com.smile.order.service.db.status.OrderStatus;
import com.smile.score.service.api.TCCScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;



@RestController
public class OrderServiceImpl implements OrderService {

    @Autowired
    private TCCScoreService tccScoreService;

    @Autowired
    private OrderReposity orderReposity;

    @Override
    public String placeOrder(Integer score, String sku) {
        Order order = new Order();
        order.setName("产品名称");
        order.setPrice(new BigDecimal("2.9"));
        order.setSku(sku);
        order.setOrderStatus(OrderStatus.PAYING);

        tccScoreService.reduceScore(3);//TODO tcc



        order.setOrderStatus(OrderStatus.CONFITRM);

//        return orderReposity.save(order).toString();

        return "";
    }
}

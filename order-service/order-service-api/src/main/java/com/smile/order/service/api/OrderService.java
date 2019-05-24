package com.smile.order.service.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "order-service")
public interface OrderService {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    String placeOrder(@RequestParam("score") Integer score, @RequestParam("sku") String sku);

}

package com.smile.product.service.api;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "product-service")
public interface ProductService {

}

package com.smile.order.service.db.domain;


import com.smile.order.service.db.status.OrderStatus;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Data
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String sku;

    private String name;

    private BigDecimal price;

    private OrderStatus orderStatus;
}

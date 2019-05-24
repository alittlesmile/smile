package com.smile.order.service.db.reposity;


import com.smile.order.service.db.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderReposity extends JpaRepository<Order,Long> {

}

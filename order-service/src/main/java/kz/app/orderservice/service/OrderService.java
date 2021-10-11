package kz.app.orderservice.service;

import kz.app.orderservice.domain.Order;

public interface OrderService {
    public Order saveOrder(Order order);
}

package kz.app.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kz.app.orderservice.domain.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}

package com.fastfoodbackend.repositories;

import com.fastfoodbackend.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDao extends JpaRepository <Order, Long> {
}

package com.example.stock.customer;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerMapper extends JpaRepository<Customer, Integer> {
}

package com.example.spring5_mvc_rest.repositories;

import com.example.spring5_mvc_rest.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}

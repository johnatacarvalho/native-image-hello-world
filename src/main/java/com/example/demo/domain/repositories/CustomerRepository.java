package com.example.demo.domain.repositories;

import com.example.demo.domain.entities.Customer;

public interface CustomerRepository {
    Customer create(Customer customer);
}

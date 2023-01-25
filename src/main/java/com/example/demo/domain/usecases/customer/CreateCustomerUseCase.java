package com.example.demo.domain.usecases.customer;

import com.example.demo.domain.entities.Customer;
import com.example.demo.domain.repositories.CustomerRepository;

public class CreateCustomerUseCase {
    private CustomerRepository customerRepository;

    public CreateCustomerUseCase(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer create(String name) {
        Customer customer = new Customer(name);
        return customerRepository.create(customer);
    }
}

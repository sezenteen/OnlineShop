package com.example.onlineshop.service;

import com.example.onlineshop.model.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CustomerService {
    List<Customer> findByCustomerAddress(String name);
    List<Customer> getAllCustomers();

//    Neg hereglechiin medeelel hadgalah
    public Customer createCustomer(Customer customer);

//    Olon hereglegchiin medeelel hadgalah
    List<Customer> createCustomers(List<Customer> customers);

//    Neg hereglegchiin medeelel avah
    public Optional<Customer> getCustomerById(Long id);

//    neg hereglegchiin medeelel zasvarlah
    public Customer updateCustomer(Customer customer);

//    Neg hereglegchiin medeelel ustgah
    public String deleteCustomerById(Long id);

// Bvh hereglegch ustgah
    List<Customer> deleteCustomers(List<Customer> customers);
}

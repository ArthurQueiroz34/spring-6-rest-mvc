package com.excalibur.spring6restmvc.services;

import com.excalibur.spring6restmvc.model.Customer;

import java.util.List;
import java.util.UUID;

public interface CustomerService {

    Customer getCostumerById(UUID uuid);

    List<Customer> getAllCustomers();


}

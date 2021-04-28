package com.example.spring5_mvc_rest.services;

import com.example.spring5_mvc_rest.api.v1.model.CustomerDTO;
import com.example.spring5_mvc_rest.domain.Customer;

import java.util.List;

public interface CustomerService {
    List<CustomerDTO> getAllCustomers();
    CustomerDTO getCustomerById(Long id);
CustomerDTO createNewCustomer(CustomerDTO customerDTO);
CustomerDTO saveCustomerByDTO(Long id,CustomerDTO customerDTO);
CustomerDTO patchCustomer(Long id,CustomerDTO customerDTO);
void deleteCustomerById(Long id);
}

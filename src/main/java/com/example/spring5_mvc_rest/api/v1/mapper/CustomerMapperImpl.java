package com.example.spring5_mvc_rest.api.v1.mapper;

import com.example.spring5_mvc_rest.api.v1.model.CustomerDTO;
import com.example.spring5_mvc_rest.domain.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapperImpl implements CustomerMapper{
    @Override
    public CustomerDTO customerToCustomerDTO(Customer customer) {
        if(customer==null){
            return null;
        }
        CustomerDTO customerDTO=new CustomerDTO();
        customerDTO.setId(customer.getId());
        customerDTO.setFirstname(customer.getFirstname());
        customerDTO.setLastname(customer.getLastname());
        return customerDTO;
    }

    @Override
    public Customer customerDtoToCustomer(CustomerDTO customerDTO) {
         if(customerDTO==null)
             return null;
         Customer customer=new Customer();
         customer.setId(customerDTO.getId());
         customer.setFirstname(customerDTO.getFirstname());
         customer.setLastname(customerDTO.getLastname());
         return customer;
    }
}

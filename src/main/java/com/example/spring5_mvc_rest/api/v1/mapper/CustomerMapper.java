package com.example.spring5_mvc_rest.api.v1.mapper;

import com.example.spring5_mvc_rest.api.v1.model.CustomerDTO;
import com.example.spring5_mvc_rest.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper {
    CustomerMapper INSTANCE= Mappers.getMapper(CustomerMapper.class);
    @Mapping(source = "id",target = "id")
    CustomerDTO customerToCustomerDTO(Customer customer);
    @Mapping(source = "id",target = "id")
  Customer customerDtoToCustomer(CustomerDTO customerDTO);
}

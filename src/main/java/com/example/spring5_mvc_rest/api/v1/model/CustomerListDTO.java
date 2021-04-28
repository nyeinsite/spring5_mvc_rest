package com.example.spring5_mvc_rest.api.v1.model;

import com.example.spring5_mvc_rest.domain.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
@Data
@AllArgsConstructor
public class CustomerListDTO {
    private List<CustomerDTO> customerList;
}

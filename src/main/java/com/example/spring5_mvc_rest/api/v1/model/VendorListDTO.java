package com.example.spring5_mvc_rest.api.v1.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VendorListDTO {
    private List<VendorDTO> vendorDTOList;
}
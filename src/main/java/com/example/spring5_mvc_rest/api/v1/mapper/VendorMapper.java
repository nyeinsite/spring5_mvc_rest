package com.example.spring5_mvc_rest.api.v1.mapper;

import com.example.spring5_mvc_rest.api.v1.model.VendorDTO;
import com.example.spring5_mvc_rest.domain.Vendor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface VendorMapper {
    VendorMapper INSTANCE= Mappers.getMapper(VendorMapper.class);
    VendorDTO vendorToVendorDTO(Vendor vendor);
    Vendor vendorDTOToVendor(VendorDTO vendorDTO);
}

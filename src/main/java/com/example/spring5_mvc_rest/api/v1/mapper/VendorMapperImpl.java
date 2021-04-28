package com.example.spring5_mvc_rest.api.v1.mapper;

import com.example.spring5_mvc_rest.api.v1.model.VendorDTO;
import com.example.spring5_mvc_rest.domain.Vendor;
import org.springframework.stereotype.Component;

@Component
public class VendorMapperImpl implements VendorMapper{
    @Override
    public VendorDTO vendorToVendorDTO(Vendor vendor) {
        if(vendor==null)
            return null;
        VendorDTO vendorDTO=new VendorDTO();
        vendorDTO.setName(vendor.getName());
        return vendorDTO;
    }

    @Override
    public Vendor vendorDTOToVendor(VendorDTO vendorDTO) {
        if(vendorDTO==null)
            return null;
        Vendor vendor=new Vendor();
        vendor.setName(vendorDTO.getName());
        return vendor;
    }
}

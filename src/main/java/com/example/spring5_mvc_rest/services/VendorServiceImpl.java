package com.example.spring5_mvc_rest.services;

import com.example.spring5_mvc_rest.api.v1.mapper.VendorMapper;
import com.example.spring5_mvc_rest.api.v1.model.VendorDTO;
import com.example.spring5_mvc_rest.domain.Vendor;
import com.example.spring5_mvc_rest.repositories.VendorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VendorServiceImpl implements VendorService{
    private final VendorMapper vendorMapper;
    private final VendorRepository vendorRepository;
    public VendorServiceImpl(VendorMapper vendorMapper, VendorRepository vendorRepository) {
        this.vendorMapper = vendorMapper;
        this.vendorRepository = vendorRepository;
    }

    @Override
    public List<VendorDTO> getAllVendors() {
        return vendorRepository.findAll()
                .stream()
                .map(vendor -> {
                    VendorDTO vendorDTO=vendorMapper.vendorToVendorDTO(vendor);
                    vendorDTO.setVendor_url("/api/v1/vendor/"+vendor.getId());
               return vendorDTO;
                }).collect(Collectors.toList());
    }

    @Override
    public VendorDTO getVendorById(Long id) {
        return vendorRepository.findById(id)
                .map(vendorMapper::vendorToVendorDTO)
                .orElseThrow(ResourceNotFoundException::new);
    }
private VendorDTO saveAndReturnDTO(Vendor vendor){
        Vendor savedVendor=vendorRepository.save(vendor);
        VendorDTO returnDto=vendorMapper.vendorToVendorDTO(savedVendor);
        returnDto.setVendor_url("/api/v1/vendor/"+savedVendor.getId());
        return returnDto;
}
    @Override
    public VendorDTO createNewVendor(VendorDTO vendorDTO) {
        return saveAndReturnDTO(vendorMapper.vendorDTOToVendor(vendorDTO));
    }

    @Override
    public VendorDTO saveVendorByDTO(Long id, VendorDTO vendorDTO) {
        Vendor vendor=vendorMapper.vendorDTOToVendor(vendorDTO);
        vendor.setId(id);
        return saveAndReturnDTO(vendor);
    }

    @Override
    public VendorDTO patchVendor(Long id, VendorDTO vendorDTO) {
        return vendorRepository.findById(id).map(vendor -> {
            if(vendorDTO.getName()!=null){
                vendor.setName(vendorDTO.getName());
            }
            VendorDTO returnDto=vendorMapper.vendorToVendorDTO(vendorRepository.save(vendor));
            return returnDto;
        }).orElseThrow(ResourceNotFoundException::new);
    }

    @Override
    public void deleteVendorById(Long id) {
vendorRepository.deleteById(id);
    }


}

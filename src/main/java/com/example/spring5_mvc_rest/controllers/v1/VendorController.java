package com.example.spring5_mvc_rest.controllers.v1;

import com.example.spring5_mvc_rest.api.v1.model.VendorDTO;
import com.example.spring5_mvc_rest.api.v1.model.VendorListDTO;
import com.example.spring5_mvc_rest.services.VendorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Api(description = "This is my vendor Controller")
@Controller
@RequestMapping("/api/v1/vendors")
public class VendorController {
    private final VendorService vendorService;

    public VendorController(VendorService vendorService) {
        this.vendorService = vendorService;
    }
   @ApiOperation(value = "This will get a list of vendors",notes = "These are some notes about the API")
    @GetMapping
    public ResponseEntity<VendorListDTO>getallVendors(){
        return new ResponseEntity<VendorListDTO>(
                new VendorListDTO(vendorService.getAllVendors()), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<VendorDTO> getVendorById(@PathVariable Long id){
        return new ResponseEntity<VendorDTO>(vendorService.getVendorById(id),HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<VendorDTO> createNewVendor(@RequestBody VendorDTO vendorDTO){
        return new ResponseEntity<VendorDTO>(vendorService.createNewVendor(vendorDTO),HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<VendorDTO> updateVendor(@PathVariable Long id, @RequestBody VendorDTO vendorDTO){
        return new ResponseEntity<VendorDTO>(vendorService.saveVendorByDTO(id,vendorDTO),HttpStatus.OK);
    }
    @PatchMapping("/{id}")
    public ResponseEntity<VendorDTO> patchVendor(@PathVariable Long id,@RequestBody VendorDTO vendorDTO){
        return new ResponseEntity<VendorDTO>(vendorService.saveVendorByDTO(id,vendorDTO),HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
public ResponseEntity<Void> deleteVendor(@PathVariable Long id){
        vendorService.deleteVendorById(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}

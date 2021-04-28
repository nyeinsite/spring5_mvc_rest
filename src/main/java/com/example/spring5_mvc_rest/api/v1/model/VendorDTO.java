package com.example.spring5_mvc_rest.api.v1.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VendorDTO {
    @ApiModelProperty(value = "name of vendor",required = true)
    private String name;
    @ApiModelProperty(value = "url of vendor",required = true)
    private String vendor_url;
}

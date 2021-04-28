package com.example.spring5_mvc_rest.api.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {
    private Long id;
    @ApiModelProperty(value = "This is first name",required = true)
    private String firstname;
    @ApiModelProperty(value = "Last Name",required = true)
    private String lastname;
    @JsonProperty("customer_url")
    private String customerUrl;
}

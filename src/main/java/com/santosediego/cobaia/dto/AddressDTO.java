package com.santosediego.cobaia.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.santosediego.cobaia.entities.Address;
import com.santosediego.cobaia.entities.Person;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressDTO {

    private Long id;
    private String road;
    private String number;
    private String district;
    private String city;
    private String zipCode;

    @JsonIgnore
    private Person person;
}

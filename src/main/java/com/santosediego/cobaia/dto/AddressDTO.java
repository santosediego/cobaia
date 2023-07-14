package com.santosediego.cobaia.dto;

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

    private Person person;

    public AddressDTO(Address entity) {
        id = entity.getId();
        road = entity.getRoad();
        number = entity.getNumber();
        district = entity.getDistrict();
        city = entity.getCity();
        zipCode = entity.getZipCode();
    }
}

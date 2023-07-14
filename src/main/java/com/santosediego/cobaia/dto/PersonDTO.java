package com.santosediego.cobaia.dto;

import com.santosediego.cobaia.entities.Address;
import com.santosediego.cobaia.entities.Person;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class PersonDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private String cpf;
    private String phone;
    private String email;

    private List<AddressDTO> addresses = new ArrayList<>();

    public PersonDTO(Person entity) {
        id = entity.getId();
        name = entity.getName();
        cpf = entity.getCpf();
        phone = entity.getPhone();
        email = entity.getEmail();
    }

    public PersonDTO(Person entity, List<Address> addresses) {
        this(entity);
        addresses.forEach(x -> this.addresses.add(new AddressDTO(x)));
    }
}

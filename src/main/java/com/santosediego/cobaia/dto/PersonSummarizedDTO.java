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
public class PersonSummarizedDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private String phone;
    private String email;
}

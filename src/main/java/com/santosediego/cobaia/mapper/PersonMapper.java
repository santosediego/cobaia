package com.santosediego.cobaia.mapper;

import com.santosediego.cobaia.dto.PersonDTO;
import com.santosediego.cobaia.dto.PersonSummarizedDTO;
import com.santosediego.cobaia.entities.Person;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    /* https://www.byiorio.com.br/product/4/item/28 */

    PersonDTO toPersonDTO(Person person);

    Person toPerson(PersonDTO personDTO);

    PersonSummarizedDTO toPersonSummarizedDTO(Person person);
}

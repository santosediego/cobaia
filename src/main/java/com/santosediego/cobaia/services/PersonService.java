package com.santosediego.cobaia.services;

import com.santosediego.cobaia.dto.PersonDTO;
import com.santosediego.cobaia.dto.PersonSummarizedDTO;
import com.santosediego.cobaia.entities.Person;
import com.santosediego.cobaia.mapper.PersonMapper;
import com.santosediego.cobaia.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonMapper personMapper;

    @Autowired
    private PersonRepository personRepository;
    private PersonDTO personDTO;

    @Transactional(readOnly = true)
    public Page<PersonSummarizedDTO> findAllPaged(Pageable pageable) {

        Page<Person> list = personRepository.findAll(pageable);
        return list.map(x -> personMapper.toPersonSummarizedDTO(x));
    }

    @Transactional(readOnly = true)
    public PersonDTO findById(Long id) {
        Optional<Person> obj = personRepository.findById(id);
        Person person = obj.orElseThrow(() -> new RuntimeException("Erro - Id não encontrado."));
        return personMapper.toPersonDTO(person);
    }

    @Transactional
    public PersonDTO insert(PersonDTO dto) {
        Person test = personMapper.toPerson(dto);
        test = personRepository.save(test);
        return personMapper.toPersonDTO(test);
    }
}

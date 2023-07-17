package com.santosediego.cobaia.controllers;

import com.santosediego.cobaia.dto.PersonDTO;
import com.santosediego.cobaia.dto.PersonSummarizedDTO;
import com.santosediego.cobaia.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/people")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping
    public ResponseEntity<Page<PersonSummarizedDTO>> findAll(Pageable pageable) {

        Page<PersonSummarizedDTO> page = personService.findAllPaged(pageable);
        return ResponseEntity.ok().body(page);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<PersonDTO> findById(@PathVariable Long id) {
        PersonDTO dto = personService.findById(id);
        return ResponseEntity.ok().body(dto);
    }

    @PostMapping
    public ResponseEntity<PersonDTO> insert(@RequestBody PersonDTO personDTO) {
        personDTO = personService.insert(personDTO);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(personDTO.getId()).toUri();

        return ResponseEntity.created(uri).body(personDTO);
    }
}

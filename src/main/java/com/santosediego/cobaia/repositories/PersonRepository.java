package com.santosediego.cobaia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santosediego.cobaia.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}

package com.santosediego.cobaia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santosediego.cobaia.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}

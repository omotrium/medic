package com.tayo.medic.dao;

import com.tayo.medic.model.Customer;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @EntityGraph(attributePaths = "authorities")
    Optional<Customer> findOneWithAuthoritiesByEmailIgnoreCase(String email);

}

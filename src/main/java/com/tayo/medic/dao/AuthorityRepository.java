package com.tayo.medic.dao;


import com.tayo.medic.model.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AuthorityRepository extends JpaRepository<Authority, String> {

}
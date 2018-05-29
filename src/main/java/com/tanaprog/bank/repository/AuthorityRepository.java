package com.tanaprog.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tanaprog.bank.entity.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, Long>{

}

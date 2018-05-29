package com.tanaprog.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tanaprog.bank.entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}

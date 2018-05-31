package com.tanaprog.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tanaprog.bank.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}

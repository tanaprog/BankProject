package com.tanaprog.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tanaprog.bank.entity.Operation;

public interface OperationRepository extends JpaRepository<Operation, Long>{

}

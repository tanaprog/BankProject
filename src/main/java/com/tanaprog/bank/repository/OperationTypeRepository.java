package com.tanaprog.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tanaprog.bank.entity.OperationType;

public interface OperationTypeRepository extends JpaRepository<OperationType, Long>{

}

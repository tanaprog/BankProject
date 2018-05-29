package com.tanaprog.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tanaprog.bank.entity.AbstractEntity;

public interface AbstractEntityRepozitory extends JpaRepository<AbstractEntity, Long>{

}

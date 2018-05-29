package com.tanaprog.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tanaprog.bank.entity.Card;

public interface CardRepository extends JpaRepository<Card, Long>{

}

package com.tanaprog.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tanaprog.bank.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

}

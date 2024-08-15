package com.example.repository;

import com.example.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Integer> {
    
    // Find account by username
    Account findByUsername(String username);

    // Find account by ID
    Optional<Account> findById(Integer id);
}

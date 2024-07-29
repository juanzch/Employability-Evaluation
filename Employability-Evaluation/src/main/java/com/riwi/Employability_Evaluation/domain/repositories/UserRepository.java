package com.riwi.Employability_Evaluation.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.riwi.Employability_Evaluation.domain.entities.User;

public interface UserRepository extends JpaRepository<User, String> {

    
}

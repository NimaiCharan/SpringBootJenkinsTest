package com.example.syncotest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.syncotest.model.User;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {

}

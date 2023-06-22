package com.jtf.springboot.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jtf.springboot.demo.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}

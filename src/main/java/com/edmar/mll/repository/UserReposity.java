package com.edmar.mll.repository;

import com.edmar.mll.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserReposity extends JpaRepository<User,Integer> {
}

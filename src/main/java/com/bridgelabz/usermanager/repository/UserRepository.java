package com.bridgelabz.usermanager.repository;

import com.bridgelabz.usermanager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

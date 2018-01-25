package com.sis.project.repository;

import com.sis.project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>
{

    User findByUsernameOrEmail(String username, String email);

}

package com.sis.project.repository;

import com.sis.project.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer>
{
    Role findByRoleId(Integer roleId);
}

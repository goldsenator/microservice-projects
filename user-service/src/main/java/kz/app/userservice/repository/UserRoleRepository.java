package kz.app.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kz.app.userservice.entity.UserRole;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
    UserRole findUserRoleByRoleName(String roleName);
}

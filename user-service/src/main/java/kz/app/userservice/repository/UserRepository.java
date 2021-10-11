package kz.app.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kz.app.userservice.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName(String userName);
}

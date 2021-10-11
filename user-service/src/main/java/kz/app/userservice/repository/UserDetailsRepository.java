package kz.app.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kz.app.userservice.entity.UserDetails;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails, Long> {
}

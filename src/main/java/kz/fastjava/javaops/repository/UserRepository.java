package kz.fastjava.javaops.repository;

import kz.fastjava.javaops.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u FROM User u where u.email = lower(:email) ")
    Optional<User> findByEmailIgnoreCase(String email);

    List<User> findByLastNameContainingIgnoreCase(String lastName);
}

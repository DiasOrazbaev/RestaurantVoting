package kz.fastjava.javaops.repository;

import kz.fastjava.javaops.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}

package kz.fastjava.javaops;

import kz.fastjava.javaops.models.Role;
import kz.fastjava.javaops.models.User;
import kz.fastjava.javaops.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;
import java.util.HashSet;

@SpringBootApplication
@AllArgsConstructor
@Slf4j
public class JavaOpsApplication implements ApplicationRunner {
    private final UserRepository repository;
    public static void main(String[] args) {
        SpringApplication.run(JavaOpsApplication.class, args);
    }


    @Override
    public void run(ApplicationArguments args) {
        repository.save(new User("orazbaevdev@gmail.com", "Dias", "Orazbaev", "1werqwerf4", new HashSet<>(Collections.singleton(Role.ROLE_ADMIN))));
        repository.save(new User("Jackmna@Mail.ru", "Jack", "Ma", "asdf2@fiifds", new HashSet<>(Collections.singleton(Role.ROLE_USER))));
        log.info(repository.findAll().toString());
    }
}

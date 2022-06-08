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

import java.util.ArrayList;
import java.util.Arrays;
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
    public void run(ApplicationArguments args) throws Exception {
        log.info(repository.findAll().toString());
    }
}

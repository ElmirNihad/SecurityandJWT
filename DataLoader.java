package org.example.security;

import org.example.security.Model.User;
import org.example.security.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    public DataLoader(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) throws Exception {
        if (userRepository.findByUsername("Elmir").isEmpty()) {
            User admin = new User("Elmir", passwordEncoder.encode("elmir123"), "ADMIN");
            userRepository.save(admin);
        }

        if (userRepository.findByUsername("Nihad").isEmpty()) {
            User user = new User("Nihad", passwordEncoder.encode("nihad123"), "USER");
            userRepository.save(user);
        }
    }
}

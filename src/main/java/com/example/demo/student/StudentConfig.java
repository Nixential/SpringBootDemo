package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student charbel = new Student(
                    "Charbel",
                    "charbel.nammour1998@gmail.com",
                    LocalDate.of(1998, Month.DECEMBER,23)
            );

            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2004, Month.DECEMBER,14)
            );

            repository.saveAll(List.of(charbel, alex));
        };
    }
}

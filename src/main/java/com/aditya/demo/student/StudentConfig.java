package com.aditya.demo.student;

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
            Student aditya = new Student(
                    "Aditya",
                    "adityadike90@gmail.com",
                    LocalDate.of(2004, Month.MARCH, 1)

            );

            Student siddhesh = new Student(
                    "Siddhesh",
                    "siddhesh@gmail.com",
                    LocalDate.of(2001, Month.MAY, 1)

            );
            repository.saveAll(
                    List.of(aditya, siddhesh)
            );
        };
    }
}

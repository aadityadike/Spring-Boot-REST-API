package com.aditya.demo.teacher;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class TeacherConfig {
    @Bean
    CommandLineRunner cmd(TeacherRepository teacherRepository) {
        return args -> {
            Teacher teacher1 = new Teacher(1L,
                    "Prashanti",
                    "English",
                    LocalDate.of(1989, Month.SEPTEMBER, 18)
            );

            Teacher teacher2 = new Teacher(2L,
                    "Pratap Kavle",
                    "Maths",
                    LocalDate.of(1980, Month.JUNE, 16)
            );

            teacherRepository.saveAll(List.of(teacher1, teacher2));
        };
    }
}

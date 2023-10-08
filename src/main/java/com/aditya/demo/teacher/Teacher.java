package com.aditya.demo.teacher;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Teacher {
    @Id
    @SequenceGenerator(
            name = "teacher_sequence",
            sequenceName = "teacher_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "teacher_sequence",
            strategy = GenerationType.SEQUENCE
    )
    private Long id;
    private String name;
    private String subject;
    private LocalDate BirthDate;

    public Teacher(Long id, String name, String subject, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.BirthDate = birthDate;
    }

    public Teacher(String name, String subject, LocalDate birthDate) {
        this.name = name;
        this.subject = subject;
        this.BirthDate = birthDate;
    }

    public Teacher() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public LocalDate getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        BirthDate = birthDate;
    }
}

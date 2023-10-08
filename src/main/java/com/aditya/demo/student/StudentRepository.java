package com.aditya.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // SELECT * FROM student WHERE email = *
    @Query("SELECT s FROM Student s WHERE s.email = ?1")
    //  It will query without this line as well just a definition for the following method.
    Optional<Student> findStudentByEmail(String email);
}

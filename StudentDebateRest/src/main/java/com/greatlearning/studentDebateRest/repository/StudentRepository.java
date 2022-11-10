package com.greatlearning.studentDebateRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.studentDebateRest.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}

package com.example.company.sms.repository;

import com.example.company.sms.Student;
import org.springframework.data.jpa.repository.JpaRepository;


    public interface StudentRepository extends JpaRepository<Student, Long> {

    }


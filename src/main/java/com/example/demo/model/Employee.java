package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
        
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="emp_id")
            private Long id;
        
        @Column(name="first_name")
        private String firstName;
        
        @Column(name="last_name")
        private String lastName;
        
        @Column(name="email_id")
        private String emailId;
}
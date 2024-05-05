package com.example.demo.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="employees")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false)
    private String firstname;

    @Column(nullable = false)
    private  String lastname;

    @Column(nullable = false)
    private String emailId;
}

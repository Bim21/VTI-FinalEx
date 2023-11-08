package com.vti.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "department")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "`name`", length = 50, nullable = false, unique = true)
    private String departmentName;

    @Column(name = "total_member")
    private int totalMember;

    @Column(name = "`type`", nullable = false)
    @Enumerated()
    private Type type;

    @Column(name = "created_date")
    private Date createDate;
}

package com.vti.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Formula;

@Entity
@Table(name = "Account")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "username", length = 50, nullable = false, unique = true)
    private String userName;

    @Column(name = "`password`", nullable = false, length = 800)
    private String passWord;

    @Column(name = "first_name", length = 50, nullable = false)
    private String firstName;

    @Column(name = "last_name", length = 50, nullable = false)
    private String lastName;

    @Formula("concat(firstName, ' ', lastName")
    private String fullName;

    @Enumerated
    private Role role;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private Department departmentId;

}

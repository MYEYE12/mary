package com.Mary.CRUD._ALUMNI.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "AlumniDB")

public class AlumniEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name="AlumniID")
    int AluminID;

    @Column(name = "AlumniName")
    String AlumniNmae;

    @Column(name = "GradurationDate")
    String GraduationDate;

    @Column(name = "DegreEarned")
    String DegreeEarned;

    @Column(name = "Phone_no")
    String Phone_no;
}

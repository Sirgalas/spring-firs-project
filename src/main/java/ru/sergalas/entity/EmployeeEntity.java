package ru.sergalas.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "employee")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private String firstName;

    private String lastName;

    private LocalDate birthDay;

    private Integer salary;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private CompanyEntity company;
}

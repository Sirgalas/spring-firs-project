package ru.sergalas.repository;

import ru.sergalas.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeCustomRepository {
    List<EmployeeEntity> findCustomQuery();
}

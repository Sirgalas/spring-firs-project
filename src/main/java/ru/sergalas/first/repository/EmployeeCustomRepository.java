package ru.sergalas.first.repository;

import ru.sergalas.first.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeCustomRepository {
    List<EmployeeEntity> findCustomQuery();
}

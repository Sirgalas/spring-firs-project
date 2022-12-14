package ru.sergalas.repository;

import lombok.RequiredArgsConstructor;
import ru.sergalas.entity.EmployeeEntity;

import javax.persistence.EntityManager;
import java.util.Collections;
import java.util.List;

@RequiredArgsConstructor
public class EmployeeCustomRepositoryImpl implements EmployeeCustomRepository{

    private final EntityManager entityManager;

    @Override
    public List<EmployeeEntity> findCustomQuery() {
        return Collections.emptyList();
    }
}

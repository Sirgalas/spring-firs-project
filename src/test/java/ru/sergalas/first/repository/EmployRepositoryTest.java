package ru.sergalas.first.repository;

import org.hamcrest.MatcherAssert;
import org.hamcrest.collection.IsCollectionWithSize;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import ru.sergalas.first.IntegrationTestBase;
import ru.sergalas.first.entity.EmployeeEntity;
import ru.sergalas.first.projection.EmployeeNameView;
import ru.sergalas.first.projection.EmployeeNativeView;

import java.util.List;
import java.util.Optional;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.collection.IsCollectionWithSize.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EmployRepositoryTest extends IntegrationTestBase {

    public static final Integer IVAN_ID = 1;
    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    void testFindById() {
        Optional<EmployeeEntity> employee = employeeRepository.findById(IVAN_ID);
        assertTrue(employee.isPresent());
    }

    @Test
    void testFindRepository() {
        Optional<EmployeeEntity> employee = employeeRepository.findByFirstNameContainingIgnoreCase("Serg");
        assertTrue(employee.isPresent());
    }

    @Test
    void  testFindByFirstNAmeAndSalary() {
        List<EmployeeEntity> employee = employeeRepository.findByFirstNameAndSalary("Serge",150000);
        assertThat(employee, hasSize(1));
    }

    @Test
    void findBySalary() {
        List<EmployeeNameView> employee = employeeRepository.findAllBySalaryGreaterThan(20000);
        assertThat(employee, hasSize(2));
    }
    @Test
    void findBySalaryNative() {
        List<EmployeeNativeView> employee = employeeRepository.findAllBySalaryGreaterThanNative(20000);
        assertThat(employee, hasSize(2));
    }

    @Test
    void testFindCustomQuery() {
        List<EmployeeEntity> employee = employeeRepository.findCustomQuery();
        assertThat(employee, hasSize(0));
    }
}
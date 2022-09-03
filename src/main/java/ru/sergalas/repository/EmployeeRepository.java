package ru.sergalas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.sergalas.entity.EmployeeEntity;
import ru.sergalas.projection.EmployeeNameView;
import ru.sergalas.projection.EmployeeNativeView;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer>, EmployeeCustomRepository {

    Optional<EmployeeEntity> findByFirstNameContainingIgnoreCase(String firstName);


    @Query("select e from EmployeeEntity e where e.firstName = :name and e.salary = :salary")
    List<EmployeeEntity> findByFirstNameAndSalary(@Param("name") String firstName,@Param("salary") Integer salary);


   List<EmployeeNameView> findAllBySalaryGreaterThan(Integer salary);


   @Query(value = "select " +
           "e.id as id, " +
           "e.first_name || e.last_name as fullName " +
           "from employee e " +
           "where e.salary > :salary",nativeQuery = true)
   List<EmployeeNativeView> findAllBySalaryGreaterThanNative(@Param("salary") Integer salary);
}

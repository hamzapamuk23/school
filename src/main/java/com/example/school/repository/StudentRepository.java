package com.example.school.repository;
import java.util.List;

import com.example.school.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "student")
public interface StudentRepository extends JpaRepository<Student,Long>
{
    @Query("SELECT s from Student s WHERE LOWER(s.name) LIKE LOWER(concat('%', concat(:name,'%'))) AND LOWER(s.surname) LIKE LOWER(concat('%', concat(:surname,'%'))) AND LOWER(s.number) LIKE LOWER(concat('%', concat(:number,'%'))) AND (s.age=:age OR s.age is null) AND (s.gpa=:gpa OR s.gpa is null) AND LOWER(s.school.name) LIKE LOWER(concat('%', concat(:schoolName,'%'))) " )
    List<Student> findAllSearch(@Param("name") String name,
        @Param("surname") String surname,
        @Param("number") String number,
        @Param("age") Integer age,
        @Param("gpa") Double gpa,
        @Param("schoolName") String schoolName);


    //List<Student> findAll(); 
    //Optional<Student> findById(Long id);
    //Student saveStudent(Student student);
    //void deleteById();
    //void saveAllAndFlush();  
    
}
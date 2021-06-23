package com.example.school.repository;

import com.example.school.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>
{
    //List<Student> findAll(); 
    //Optional<Student> findById(Long id);
    //Student saveStudent(Student student);
    //void deleteById();
    //void saveAllAndFlush();  
    
}
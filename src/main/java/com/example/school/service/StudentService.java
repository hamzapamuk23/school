// package com.example.school.service;

// import java.util.List;
// import java.util.Optional;

// import com.example.school.entity.Student;
// import com.example.school.repository.StudentRepository;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// @Service
// public class StudentService
// {
//     @Autowired
//     StudentRepository studentRepository;

//     public List<Student> getAllStudents() 
//     {
//         return studentRepository.findAll();             
//     }

//     public Student getById(Long id)
//     {
//         Optional<Student> result=studentRepository.findById(id);
//         return result.get();
//     }

//     public Student add(Student student)
//     {
//         return studentRepository.save(student);
//     }

//     public void delete(Long id)
//     {
//         studentRepository.deleteById(id);        
//     }

//     public void alldelete()
//     {
//         studentRepository.deleteAll();
//     }
//     public void update(Student student)
//     {
//         studentRepository.saveAndFlush(student);
//     }  
    
// }

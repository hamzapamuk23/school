// package com.example.school.service;

// import java.util.List;
// import java.util.Optional;
// import com.example.school.entity.School;
// import com.example.school.repository.SchoolRepository;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// @Service
// public class SchoolService
// {
//     @Autowired
//     SchoolRepository schoolRepository;

//     public List<School> getAllSchools() 
//     {
//         return schoolRepository.findAll();             
//     }

//     public School getById(Long id)
//     {
//         Optional<School> result=schoolRepository.findById(id);
//         return result.get();
//     }

//     public School add(School school)
//     {
//         return schoolRepository.save(school);
//     }

//     public void delete(Long id)
//     {
//         schoolRepository.deleteById(id);        
//     }

//     public void alldelete()
//     {
//         schoolRepository.deleteAll();
//     }
//     public void update(School school)
//     {
//         schoolRepository.saveAndFlush(school);
//     }  
    
// }

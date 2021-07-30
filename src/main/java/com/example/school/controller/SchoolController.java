// package com.example.school.controller;
// import java.util.List;

// import com.example.school.entity.School;
// import com.example.school.service.SchoolService;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RestController;

// @RequestMapping("/student")
// @RestController
// public class SchoolController 
// {
//     @Autowired
//     SchoolService schoolService;

//     @GetMapping("")
//     List<School> all()
//     {
//         return schoolService.getAllSchools();
//     }
//     @GetMapping("/getById")
//     public School getId(@RequestParam("id") Long id)
//     {
//         return schoolService.getById(id);
//     }

//     @PostMapping("")
//     public ResponseEntity<String> addSchool(@RequestBody School School)
//     {
//         schoolService.add(School);
//         return new ResponseEntity<>("School Added" , HttpStatus.CREATED) ;
//     }

//     @DeleteMapping("")
//     public ResponseEntity<String> deleteSchool(@RequestParam("id") Long id)
//     {
//         schoolService.delete(id);
//         return new ResponseEntity<>("School Deleted" , HttpStatus.OK) ;
//     }
//     @DeleteMapping("/allDelete")
//     public ResponseEntity<String> deleteAllSchool()
//     {
//         schoolService.alldelete();
//         return new ResponseEntity<>("All Deleted Respository" , HttpStatus.NO_CONTENT) ;
//     }

//     @PutMapping("")
//     public ResponseEntity<String> updateSchool(@RequestBody School School)
//     {
//         schoolService.update(School);
//         return new ResponseEntity<>("School Registration Updated" , HttpStatus.OK) ;
//     }
    
// }

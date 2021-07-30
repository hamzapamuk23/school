// package com.example.school.controller;

// import java.util.List;
// import com.example.school.entity.Student;
// import com.example.school.service.StudentService;
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
// public class StudentController 
// {
//     @Autowired
//     StudentService studentService;

//     @GetMapping("")
//     List<Student> all()
//     {
//         return studentService.getAllStudents();
//     }
//     @GetMapping("/getById")
//     public Student getId(@RequestParam("id") Long id)
//     {
//         return studentService.getById(id);
//     }

//     @PostMapping("")
//     public ResponseEntity<String> addStudent(@RequestBody Student student)
//     {
//         studentService.add(student);
//         return new ResponseEntity<>("Student Added" , HttpStatus.CREATED) ;
//     }

//     @DeleteMapping("")
//     public ResponseEntity<String> deleteStudent(@RequestParam("id") Long id)
//     {
//         studentService.delete(id);
//         return new ResponseEntity<>("Student Deleted" , HttpStatus.OK) ;
//     }
//     @DeleteMapping("/allDelete")
//     public ResponseEntity<String> deleteAllStudent()
//     {
//         studentService.alldelete();
//         return new ResponseEntity<>("All Deleted Respository" , HttpStatus.NO_CONTENT) ;
//     }

//     @PutMapping("")
//     public ResponseEntity<String> updateStudent(@RequestBody Student student)
//     {
//         studentService.update(student);
//         return new ResponseEntity<>("Student Registration Updated" , HttpStatus.OK) ;
//     }
    
// }

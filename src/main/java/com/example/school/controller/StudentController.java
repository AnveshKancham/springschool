/*
 *
 * You can use the following import statemets
 *
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 *
 */
 
package com.example.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

import com.example.student.service.StudentH2Service;
import com.example.student.model.Student;

@RestController
public class StudentController{
    @Autowired
    private StudentsH2Service studentService;

    @GetMapping("/student")
    public ArrayList<Student> geStudents(){
        return studentService.geStudents();

    }
    @GetMapping("/student/{studentId}")
    public Student getStudentById(@PathVariable("studentId") int studentId){
        return studentService.getStudentById(studentId);
    }
    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student){
        return studentservice.addStudent(student);
    }
    @GetMapping("/players/{playerId}")
    public Student updateStudent(@PathVariable("studentId") int studentId, @RequestBody Student student){
        return studentService.updateStudent(studentId,student);
    }
    @DeleteMapping("/player/{playerId}")
    public void deleteStudent(@PathVariable int studentId){
        studentService.deleteStudent(studentId);
    }

}

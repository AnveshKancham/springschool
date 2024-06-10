// Write your code here
package com.example.student.repository;
import java.util.*;

import com.example.school.model.Student;
import com.example.student.model.Student;

public interface StudentRepository{
    ArrayList<Student> getStudent();
    Student getStudentById(int studentId);

    Student addStudent(Student student);

    Student updateStudent(int studentId, Student student);

    void deleteStudent(int studentId);
}
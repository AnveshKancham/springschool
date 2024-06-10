/*
 * You can use the following import statements
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.http.HttpStatus;
 * import org.springframework.jdbc.core.JdbcTemplate;
 * import org.springframework.stereotype.Service;
 * import org.springframework.web.server.ResponseStatusException;
 * import java.util.ArrayList;
 *
 */

// Write your code here
package com.example.school.service;

import com.example.school.model.Student;
import com.example.school.model.StudentRowMapper;
import com.example.school.repository.StudentRepository;
import com.example.school.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import java.util.ArrayList;

@Service
public class StudentH2Service implements StudentRepository {

    @Autowired
    private JdbcTemplate db;

    @Override
    public ArrayList<Student> getStudent() {
        return (ArrayList<Student>) db.query("select* from class", new StudentRowMapper());
    }

    @Override
    public Student getStudentById(int studentId) {
        try {
            return db.queryForObject("select*from class studentId=?", new StudentRowMapper(), studentId);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT.FOUND);
        }
    }

    @Override
    public Student addStudent(Student student) {
        db.update("insert intp team(studentName,gendet,standard)values(?,?,?)", student.getStudentName(),
                student.getGender(), student.getStandard());
        return db.queryForObject("select*from class studentName=? and gender=?", new StudentRowMapper(),
                student.getStudentName(), student.getGender());
    }

    @Override
    public void deleteStudent(int studentId) {
        db.update("delete from team where studentId=?", studentId);

    }

   @Override
   public Student updateStudent(int studentId,Student student){
    if(student.getStudentName()!=null){
        db.update("update team set studentName=? where studentId=?",student.getStudentName(),studentId);
   }
   if(student.getGender()!=null){
        db.update("update team set gender=? where studentId=?",student.getGender(),studentId);
   }
   if(student.getStandard()!=0){
        db.update("update team set standard=? where studentId=?",student.getStandard(),studentId);
   }
return getStudentById(studentId);
}
}
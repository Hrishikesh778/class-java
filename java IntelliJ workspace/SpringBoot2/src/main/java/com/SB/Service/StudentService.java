package com.SB.Service;

import com.SB.Entity.Student;
import com.SB.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    public StudentRepo studentRepo;

    public Student createStudent(Student student){

        return studentRepo.save(student);
    }


    public List<Student> getAllStudent(){

        return studentRepo.findAll();
    }

    public void deleteStudentById(Long id){

        studentRepo.deleteById(id);
    }
}

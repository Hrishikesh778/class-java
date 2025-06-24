package com.SB.Service;

import com.SB.Entity.Student;
import com.SB.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

    public List<Student> searchByStudentName(String prifix){

      return   studentRepo.findByNameStartingWithIgnoreCase2(prifix);
    }

//    public List<Student> searchByStudentName(String prifix, Pageable pageable){
//
//        return   studentRepo.findByNameStartingWithIgnoreCase2(prifix,pageable);
//    }

    public Page<Student> searchByStudentName(String prifix, Pageable pageable){

        return   studentRepo.findByNameStartingWithIgnoreCase2(prifix,pageable);
    }

}

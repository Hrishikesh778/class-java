package com.SB.Controller;


import com.SB.Entity.Student;
import com.SB.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentControllerRestful {

    @Autowired
    public StudentService studentService;


    @PostMapping("/save")
    @ResponseBody
    public String saveStudent(@RequestBody Student student){
        studentService.createStudent(student);
        return "Student data save Successfully";
    }


    @GetMapping("/getAll")
    @ResponseBody
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }


    //delete using body
    @DeleteMapping("/deleteById")
    @ResponseBody
    public String deleteStudent(@RequestBody Student student){
        studentService.deleteStudentById(student.getId());
        return "Student data deleted Successfully";
    }

    //delete using id in url
    @DeleteMapping("/deleteById/{id}")
    @ResponseBody
    public String deleteStudent(@PathVariable Long id){
        studentService.deleteStudentById(id);
        return "Student data deleted Successfully";
    }

    @PostMapping("/searchByStudentNameStartWith")
    @ResponseBody
    public List<Student> searchByStudentNameStartWith(@RequestBody Student student){

        return studentService.searchByStudentName(student.name);
    }


//    @PostMapping("/searchByStudentNameStartWithUsingPagenation")
//    @ResponseBody
//    public List<Student> searchByStudentNameStartWithUsingPagenation(@RequestBody Student student){
//        Pageable pageable= PageRequest.of(student.getOffset(),student.getPageSize());
//        return studentService.searchByStudentName(student.getName(),pageable);
//    }

    @PostMapping("/searchByStudentNameStartWithUsingPagenation")
    @ResponseBody
    public Page<Student> searchByStudentNameStartWithUsingPagenation(@RequestBody Student student){
        Pageable pageable= PageRequest.of(student.getOffset(),student.getPageSize());
        return studentService.searchByStudentName(student.getName(),pageable);
    }
}

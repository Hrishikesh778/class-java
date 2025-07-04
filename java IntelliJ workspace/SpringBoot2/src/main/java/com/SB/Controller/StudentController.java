package com.SB.Controller;

import com.SB.Entity.Student;
import com.SB.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin(origins = "*")
public class StudentController {
    //rest api and crud operation
    @Autowired
    public StudentService studentService;

    //to show what was inserted into table ,it can also be use to update data but we have to add id too
//    @RequestMapping(path = "/save",method = RequestMethod.POST)
//    @ResponseBody
//    public Student saveStudent(@RequestBody Student student){
//        System.out.println("Saveeeeeeeeeeee");
//       return studentService.createStudent(student);
//    }

    //to only show the message
    @RequestMapping(path = "/save",method = RequestMethod.POST)
    @ResponseBody
    public String saveStudent(@RequestBody Student student){
        System.out.println("Saveeeeeeeeeeee");
        studentService.createStudent(student);

        return "Student data save Successfully";
    }


    @RequestMapping(path = "/getAll",method = RequestMethod.GET)
    @ResponseBody
    public List<Student> getAllStudent(){
       return studentService.getAllStudent();
    }


//    //delete using body
//    @RequestMapping(path = "/deleteById",method = RequestMethod.DELETE)
//    @ResponseBody
//    public String deleteStudent(@RequestBody Student student){
//        studentService.deleteStudentById(student.getId());
//        return "Student data deleted Successfully";
//    }

    //delete using id in url
    @RequestMapping(path = "/deleteById/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public String deleteStudent(@PathVariable Long id){
        studentService.deleteStudentById(id);
        return "Student data deleted Successfully";
    }




}

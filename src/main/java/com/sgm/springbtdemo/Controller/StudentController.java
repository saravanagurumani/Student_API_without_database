package com.sgm.springbtdemo.Controller;

import com.sgm.springbtdemo.Model.Student;
import com.sgm.springbtdemo.Service.Imple.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class StudentController {

    @Autowired
    StudentService studentser;

    @GetMapping("students")
    public List<Student> getallstudent(){
        return studentser.getallstudentlist();
    }

    @GetMapping("student/{studentid}")
    public void getstudentbyid(@PathVariable int studentid){
        studentser.getstudentbyid(studentid);
    }

    @PostMapping ("addstudent")
    public void addstudent(@RequestBody Student student){
        studentser.addnewstudent(student);
    }

    @PutMapping("updatestudent")
    public void updatestudent(@RequestBody Student student){
        studentser.updatestudent(student);
    }

    @DeleteMapping("deletestudent/{studentid}")
    public  void deletestudent(@PathVariable int studentid){
        studentser.deletestudent(studentid);
    }

}

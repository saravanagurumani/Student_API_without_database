package com.sgm.springbtdemo.Service;

import com.sgm.springbtdemo.Model.Student;

import java.util.List;

public interface StudentServiceIf {
    public List<Student> getallstudentlist();
    public String addnewstudent(Student student);
    public Student getstudentbyid(int studentId);
    public void updatestudent(Student student);
    public void deletestudent(int studentId);
}

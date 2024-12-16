package com.sgm.springbtdemo.Service.Imple;

import com.sgm.springbtdemo.Model.Student;
import com.sgm.springbtdemo.Service.StudentServiceIf;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService implements StudentServiceIf {

    public List<Student> students= new ArrayList<>();

    @Override
    public List<Student> getallstudentlist() {
        return students;
    }

    @Override
    public String addnewstudent(Student student) {
        students.add(student);
        return "Successfully added...";
    }

    @Override
    public Student getstudentbyid(int studentId) {
        for(Student student : students){
            if(student.getId()==studentId){
                return student;
            }
        }
        return new Student(404,"Not Found",0,"nil");
    }

    @Override
    public void updatestudent(Student student) {
        int index=0;
        for(int i=1;i < students.size();i++){
            if(students.get(i).getId()==student.getId()){
                index=i;
            }
        }
        students.set(index,student);
    }

    @Override
    public void deletestudent(int studentId) {
        int index=0;
        for(int i=1;i < students.size();i++){
            if(students.get(i).getId()==studentId){
                index=i;
            }
        }
        students.remove(index);
    }
}

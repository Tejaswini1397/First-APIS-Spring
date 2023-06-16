package com.FirstAPI.StudentManagementPortal;

import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.*;
@Repository
public class StudentRepository {
    Map<Integer,Student> studentsDb=new HashMap<>();
    public Student getStudent(int admnNo){
        return studentsDb.get(admnNo);
    }

    public String addStudent(Student student) {
        if(studentsDb.containsKey(student)){
            return "Student Already Exist";
        }
        studentsDb.put(student.getAdmnNo(),student);
        return "Student Added Successfully";
    }

    public Student getPathVariable(int admnNo) {
        return studentsDb.get(admnNo);
    }
    public String deleteStudent(int admnNo){
        studentsDb.remove(admnNo);
        return "Student deleted Sucessfully";
    }

    public Student updateCourse(int admnNo, String newCourse) {
        if (!studentsDb.containsKey(admnNo)) {
            throw new RuntimeException("Student Doesn't Exists");
        }
        Student student=studentsDb.get(admnNo);
        student.setCourse(newCourse);
        return student;
    }
    public int getTotalStudent(){
        int total=0;
        for(int admnNo:studentsDb.keySet()){
            if(studentsDb.get(admnNo).getAge()>25){
                total++;
            }
        }
        return total;
    }
}

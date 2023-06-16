package com.FirstAPI.StudentManagementPortal;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public Student getStudent(int admnNo){
        return studentRepository.getStudent(admnNo);
    }

    public String addStudent(Student student) {
        return studentRepository.addStudent(student);
    }

    public String getStudentByPathVariable(int admnNo, String message) {
        Student s= studentRepository.getPathVariable(admnNo);
        return s+message;
    }
    public String deleteStudent(int admnNo){
        return studentRepository.deleteStudent(admnNo);
    }

    public Student updateCourse(int admnNo, String course) {
        return studentRepository.updateCourse(admnNo,course);
    }
    public int getTotalStudent(){
        return studentRepository.getTotalStudent();
    }
}

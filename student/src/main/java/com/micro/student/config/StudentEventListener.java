//package com.micro.student.config;
//
//import com.micro.student.Service.StudentService;
//import com.micro.student.model.Student;
//import org.springframework.context.annotation.Bean;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.function.Consumer;
//
//@Service
//public class StudentEventListener {
//
//    private final StudentService studentService;
//
//    public StudentEventListener(StudentService studentService) {
//        this.studentService = studentService;
//    }
//
//    @Bean
//    public Consumer<Integer> studentRequest() {
//        return schoolId -> {
//            System.out.println("Received request for school ID: " + schoolId);
//            List<Student> students = studentService.findAllStudentsBySchool(schoolId);
//            // TODO: Send students to Kafka topic for response handling
//        };
//    }
//}
//

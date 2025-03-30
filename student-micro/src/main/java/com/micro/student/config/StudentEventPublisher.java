//package com.micro.student.config;
//
//import com.micro.student.Dto.StudentResponse;
//import com.micro.student.mapper.StudentMapper;
//import com.micro.student.model.Student;
//import org.springframework.cloud.stream.function.StreamBridge;
//import org.springframework.stereotype.Service;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@Service
//public class StudentEventPublisher {
//
//    private final StreamBridge streamBridge;
//
//    public StudentEventPublisher(StreamBridge streamBridge) {
//        this.streamBridge = streamBridge;
//    }
//
//    public void sendStudentData(Integer schoolId, List<Student> students) {
//
//        List<StudentResponse> studentResponses = StudentMapper.toResponse(students);
//
//        Map<Integer, List<StudentResponse>> response = new HashMap<>();
//        response.put(schoolId, studentResponses);
//
//        streamBridge.send("studentResponse-out-0", response);
//    }
//}
//

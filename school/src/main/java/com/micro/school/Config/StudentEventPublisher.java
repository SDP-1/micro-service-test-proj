//package com.micro.school.Config;
//
//import org.springframework.cloud.stream.function.StreamBridge;
//import org.springframework.stereotype.Service;
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
//    public void requestStudentsBySchool(Integer schoolId) {
//        streamBridge.send("studentRequest-out-0", schoolId);
//    }
//}
//

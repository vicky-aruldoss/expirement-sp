package com.example.sptutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController

public class SpTutorialApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpTutorialApplication.class, args);
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name,
                           @RequestParam(value = "myAge") int age) {
        return String.format("Hello %s and my age is %d", name,age);
    }

    @PostMapping("/create-student")
    public String createStudent(@RequestBody StudentRequest studentReq)
    {
        return String.format("Hello %s and your mail id is %s and your degree is %s", studentReq.Name,studentReq.Email,studentReq.Degree);
    }
}

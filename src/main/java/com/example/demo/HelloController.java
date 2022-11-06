package com.example.demo;



import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @HystrixCommand(groupKey = "hystrics-caller", commandKey = "call")
    @GetMapping(value = "/hello")
    public String hello() {
        return "Hello, hey demo ewa";
    }

}


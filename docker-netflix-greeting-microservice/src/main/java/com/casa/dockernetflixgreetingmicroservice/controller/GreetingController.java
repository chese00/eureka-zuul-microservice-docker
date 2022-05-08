package com.casa.dockernetflixgreetingmicroservice.controller;


import com.casa.dockernetflixgreetingmicroservice.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("greeting-microservice")
public class GreetingController {

    GreetingService greetingService;

    public GreetingController(@Autowired GreetingService greetingService) {
        this.greetingService=greetingService;
    }

    @GetMapping("/greet")
    public String getGreeting() throws Exception {
        return greetingService.getServiceGreeting();
    }
}

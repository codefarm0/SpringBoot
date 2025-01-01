package com.codefarm.order;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hey")
    String sayHi(){
        return "Hello there..";
    }
}

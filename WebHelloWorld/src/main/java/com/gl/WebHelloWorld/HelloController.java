package com.gl.WebHelloWorld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("/greet")
    public String getName(@RequestParam(name = "name", required = false, defaultValue = "India") String name, Model model){
        model.addAttribute("name", name);
        return "greet";
    }
}

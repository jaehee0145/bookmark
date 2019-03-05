package myexamples.bookmark.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController
{
    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "Spring MVC Thymeleaf Hello World Example!!");
        return "hello";
    }
}

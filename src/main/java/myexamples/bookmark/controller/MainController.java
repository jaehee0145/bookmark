package myexamples.bookmark.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "Spring MVC Thymeleaf Hello World Example!!");
        return "main";
    }

    @GetMapping("/main")
    public String main(Model model) {
        model.addAttribute("message", "Spring MVC Thymeleaf Hello World Example!!");
        return "main";
    }
}

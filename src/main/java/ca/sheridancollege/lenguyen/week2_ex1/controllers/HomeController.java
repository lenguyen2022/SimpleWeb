package ca.sheridancollege.lenguyen.week2_ex1.controllers;

import ca.sheridancollege.lenguyen.week2_ex1.beans.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @Autowired
    private Student student;

    /*
    
    Case 1
    public HomeController(Student student) {
        this.student = student;
    }

    Case 2

    @Autowired
    public void setStudent(Student student) {
        this.student = student;
    }
     */

    @GetMapping("/")
    public String index(){
        return "index";
    }
    @PostMapping("/formPost")
    public String formPost(@RequestParam String firstName, @RequestParam String lastName){

        student.setFirstName(firstName);
        student.setLastName(lastName);
        System.out.println(student);

        return "working";
    }
}

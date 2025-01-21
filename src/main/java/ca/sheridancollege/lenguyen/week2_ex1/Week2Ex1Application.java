package ca.sheridancollege.lenguyen.week2_ex1;

import ca.sheridancollege.lenguyen.week2_ex1.beans.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Week2Ex1Application {

    public static void main(String[] args) {
        //Student student = Student.builder().firstName("John").lastName("Doe").build();
        SpringApplication.run(Week2Ex1Application.class, args);
    }

}

package ca.sheridancollege.lenguyen.week2_ex1.beans;


import lombok.Data;
import org.springframework.stereotype.Component;


@Data
@Component
public class Student {
    private String firstName;
    private String lastName;
}

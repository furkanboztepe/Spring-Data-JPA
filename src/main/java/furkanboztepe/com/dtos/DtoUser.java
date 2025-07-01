package furkanboztepe.com.dtos;

import furkanboztepe.com.entities.Course;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoUser {
    private Long id;

    private String firstName;
    private String lastName;
    private String email;

    private List<DtoCourse> courses;
}

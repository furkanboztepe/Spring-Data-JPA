package furkanboztepe.com.repositories;

import furkanboztepe.com.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository  extends JpaRepository <Course, Long> {
}

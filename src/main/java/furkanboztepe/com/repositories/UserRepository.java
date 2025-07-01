package furkanboztepe.com.repositories;

import furkanboztepe.com.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository <User, Long> {
    User findByEmail(String email);

    @Query(value = "from User" , nativeQuery = false)
    List<User> findAllUsers();
}

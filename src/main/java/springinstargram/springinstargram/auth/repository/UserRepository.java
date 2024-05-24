package springinstargram.springinstargram.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springinstargram.springinstargram.auth.entity.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    public User findByUsername(String username);
    List<User> findAll();
}

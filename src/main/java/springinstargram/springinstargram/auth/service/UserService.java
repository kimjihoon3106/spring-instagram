package springinstargram.springinstargram.auth.service;

import org.springframework.stereotype.Service;
import springinstargram.springinstargram.auth.entity.User;
import springinstargram.springinstargram.auth.repository.UserRepository;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public List<User> findUsers(){
        return userRepository.findAll();
    }
}

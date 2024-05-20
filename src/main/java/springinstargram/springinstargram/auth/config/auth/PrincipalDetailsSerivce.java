package springinstargram.springinstargram.auth.config.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import springinstargram.springinstargram.auth.entity.User;
import springinstargram.springinstargram.auth.repository.UserRepository;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Service
public class PrincipalDetailsSerivce implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        System.out.println("username : " + username);
        User userEntity = userRepository.findByUsername(username);
        if (userEntity != null) {
            return new PrincipalDetails(userEntity);
        } else {
            return null;
        }
    }
}

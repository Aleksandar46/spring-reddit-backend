package spring.reddit.springredditbackend.service;

import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import spring.reddit.springredditbackend.dto.RegisterReques;
import spring.reddit.springredditbackend.model.User;
import spring.reddit.springredditbackend.repository.UserRepository;

import javax.transaction.Transactional;
import java.time.Instant;

@Service
@AllArgsConstructor
public class AuthService {

    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;

    @Transactional
    public void signup(RegisterReques registerReques){
        User user = new User();
        user.setUsername(registerReques.getUsername());
        user.setEmail(registerReques.getEmail());
        user.setPassword(passwordEncoder.encode(registerReques.getPassword()));
        user.setCreated(Instant.now());
        user.setEnabled(false);
        userRepository.save(user);
    }
}

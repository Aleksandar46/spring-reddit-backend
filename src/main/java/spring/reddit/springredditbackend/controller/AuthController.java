package spring.reddit.springredditbackend.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.reddit.springredditbackend.dto.LoginRequest;
import spring.reddit.springredditbackend.dto.RegisterReques;
import spring.reddit.springredditbackend.service.AuthService;

@RestController
@RequestMapping("/api/auth")
@AllArgsConstructor
public class AuthController {

    private final AuthService authService;
    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody RegisterReques registerReques){
        authService.signup(registerReques);
        return new ResponseEntity<>("User Registration Successful",HttpStatus.OK);
    }

    @PostMapping("/login")
    public void login(@RequestBody LoginRequest loginRequest){
        authService.login(loginRequest);
    }
}

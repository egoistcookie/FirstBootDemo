package com.lf.controller;

import com.lf.entity.User;
import com.lf.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private AuthService authService;

    // @PostMapping("/login")
    // public ResponseEntity<User> login(@RequestParam String username,
    //                                  @RequestParam String password) {
    //     User user = authService.login(username, password);
    //     if (user != null) {
    //         return ResponseEntity.ok(user);
    //     }
    //     return ResponseEntity.status(401).build();
    // }

    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody LoginRequest loginRequest) {
        User user = authService.login(loginRequest.getUsername(), loginRequest.getPassword());
        if (user != null) {
            return ResponseEntity.ok(user);
        }
        return ResponseEntity.status(401).build();
    }

    public static class LoginRequest {
        private String username;
        private String password;
        // getters and setters

        public LoginRequest(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }
}
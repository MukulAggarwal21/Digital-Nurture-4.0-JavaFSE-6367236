package com.example.jwtauth;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
public class AuthController {

    private final String SECRET_KEY = "my_secret_key";

    @GetMapping("/authenticate")
    public ResponseEntity<Map<String, String>> authenticate(@RequestHeader("Authorization") String authHeader) {
        if (authHeader == null || !authHeader.startsWith("Basic ")) {
            return ResponseEntity.status(401).build();
        }

        String base64Credentials = authHeader.substring("Basic ".length());
        byte[] decodedBytes = Base64.getDecoder().decode(base64Credentials);
        String credentials = new String(decodedBytes);
        String[] values = credentials.split(":", 2);

        String username = values[0];
        String password = values[1];

        if (!"user".equals(username) || !"pwd".equals(password)) {
            return ResponseEntity.status(401).build();
        }

        String token = Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 10))
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY.getBytes())
                .compact();

        Map<String, String> response = new HashMap<>();
        response.put("token", token);

        return ResponseEntity.ok(response);
    }
}
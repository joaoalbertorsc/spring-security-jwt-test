package com.roadmapsh.spring_security_jwt.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
@AllArgsConstructor
public class AuthenticationResponse {
    private final String jwt;

    public String getJwt() {
        return jwt;
    }
}

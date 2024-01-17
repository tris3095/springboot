package com.codewithproject.springboot.services;

import com.codewithproject.springboot.dto.RefreshTokenRequest;
import com.codewithproject.springboot.dto.SignInRequest;
import com.codewithproject.springboot.dto.SignUpRequest;
import com.codewithproject.springboot.models.User;
import com.codewithproject.springboot.services.impl.JwtAuthenticationResponse;

public interface AuthenticationService {
    User signup(SignUpRequest signUpRequest);

    JwtAuthenticationResponse signin(SignInRequest signInRequest);

    JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}

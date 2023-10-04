package com.codewitheme.todomanagement.service;

import com.codewitheme.todomanagement.dto.LoginDto;
import com.codewitheme.todomanagement.dto.RegisterDto;

public interface AuthService {
    String register(RegisterDto registerDto);

    String login(LoginDto loginDto);
}

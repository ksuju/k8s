package com.ll.k8s.domain.home.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * packageName    : com.ll.k8s.domain.home.controller
 * fileName       : HomeController
 * author         : sungjun
 * date           : 2025-01-17
 * description    : 자동 주석 생성
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-01-17        kyd54       최초 생성
 */
@Controller
public class HomeController {
    @Value("${custom.jwt.secretKey}")
    private String jwtSecretKey;
    @GetMapping("/")
    public String home() {
        return "home";
    }
    @GetMapping("/jwtSecretKey")
    @ResponseBody
    public String showJwtSecretKey() {
        return jwtSecretKey;
    }
}

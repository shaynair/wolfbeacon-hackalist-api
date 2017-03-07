package com.wolfbeacon.api.v1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class SecuredPingTest {

    @RequestMapping("/v1/secured/ping")
    public String securedPing(HttpServletRequest request, HttpServletResponse response) {
        return "This is a secured endpoint. You have a valid token!";
    }

    @RequestMapping("/v1/ping")
    public String ping(HttpServletRequest request, HttpServletResponse response) {
        return "This is a secured endpoint. You have a valid token!";
    }
}
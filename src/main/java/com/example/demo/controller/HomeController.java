package com.example.demo.controller;


import com.example.demo.response.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

        @GetMapping
        public ApiResponse HomeControllerHandle(){
            ApiResponse apiResponse = new ApiResponse();
            apiResponse.setMessage("Welcome to ecommerce system");
            return apiResponse;
    }
}

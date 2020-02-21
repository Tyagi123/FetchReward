package com.main.controller;

import com.main.service.ValidatePyramidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidatePyramidController {

@Autowired
ValidatePyramidService  service;

    @PostMapping("/validate")
    @ResponseBody
    public Boolean validate(String value) {
        return service.isPyramid(value);
    }
}

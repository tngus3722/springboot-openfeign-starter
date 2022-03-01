package com.tngus3722.openfeignstarter.controller;

import com.tngus3722.openfeignstarter.service.lectureBank.LectureBankService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class TestController {
    private final LectureBankService lectureBankService;

    @GetMapping("/test")
    public String test(){
        lectureBankService.getLectureBanks();
        return "hello openFeign";
    }
}

package com.mobileapp.account.management.ui.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accountmanagement")
public class AccountManagementController {

    @GetMapping("/status")
    public String getStatus(){
        return "Working";
    }
}

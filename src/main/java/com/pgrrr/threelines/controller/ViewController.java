package com.pgrrr.threelines.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pgrrr.threelines.service.ViewService;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
@RequestMapping("/")
public class ViewController {

    private final ViewService viewService;

    @GetMapping("")
    public ResponseEntity<String> getSubscriptionList(){
        return ResponseEntity.ok().body("");
    }

}

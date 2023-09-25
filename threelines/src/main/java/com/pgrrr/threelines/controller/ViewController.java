package com.pgrrr.threelines.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class ViewController {

    @GetMapping("")
    public ResponseEntity<String> getSubscriptionLists(){
        return ResponseEntity.ok().body("");
    }

}

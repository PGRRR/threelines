package com.pgrrr.threelines.controller;

import com.pgrrr.threelines.domain.Member;
import com.pgrrr.threelines.service.MemberService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/members")
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/{id}")
    public ResponseEntity<Member> getUserById(@PathVariable Long id) {
        return ResponseEntity.ok(new Member());
    }

    @PostMapping("")
    public ResponseEntity<String> createUser(@RequestBody Member member) {
        return ResponseEntity.status(HttpStatus.CREATED).body("Member created successfully");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateUser(@PathVariable Long id, @RequestBody Member member) {
        return ResponseEntity.ok("Member updated successfully");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        return ResponseEntity.ok("Member deleted successfully");
    }

}

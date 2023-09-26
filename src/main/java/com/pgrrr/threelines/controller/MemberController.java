package com.pgrrr.threelines.controller;

import com.pgrrr.threelines.domain.Member;
import com.pgrrr.threelines.service.MemberService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/members")
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/{memberNo}")
    public ResponseEntity<Member> getUserById(@PathVariable Long memberNo) {
        List<Member> memberList = memberService.getMemberList();
        Member member = memberList.get(0);
        return ResponseEntity.ok(member);
    }

    @PostMapping("")
    public ResponseEntity<String> createUser(@RequestBody Member member) {
        return ResponseEntity.status(HttpStatus.CREATED).body("Member created successfully");
    }

    @PutMapping("/{memberNo}")
    public ResponseEntity<String> updateUser(@PathVariable Long memberNo, @RequestBody Member member) {
        return ResponseEntity.ok("Member updated successfully");
    }

    @DeleteMapping("/{memberNo}")
    public ResponseEntity<String> deleteUser(@PathVariable Long memberNo) {
        return ResponseEntity.ok("Member deleted successfully");
    }

}

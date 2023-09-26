package com.pgrrr.threelines.controller;

import com.pgrrr.threelines.domain.Content;
import com.pgrrr.threelines.service.ContentService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contents")
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class ContentController {

    private final ContentService contentService;

    @GetMapping("")
    public ResponseEntity<List<String>> getContentList(){
        List<String> contentList = contentService.getSubscriptionList();
        return ResponseEntity.ok(contentList);
    }

    @PostMapping("")
    public ResponseEntity<String> addContent(@RequestBody Content content){
        return ResponseEntity.status(HttpStatus.CREATED).body("Content created successfully");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> modifyContent(@PathVariable Long id, @RequestBody Content content) {
        return ResponseEntity.ok("Content modified successfully");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> removeContent(@PathVariable Long id) {
        return ResponseEntity.ok("Content removed successfully");
    }

}

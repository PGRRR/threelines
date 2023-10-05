package com.pgrrr.threelines.controller;

import com.pgrrr.threelines.domain.Content;
import com.pgrrr.threelines.dto.ContentRequestDto;
import com.pgrrr.threelines.dto.ContentResponseDto;
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
    public ResponseEntity<List<ContentResponseDto>> getContentList(){
        List<ContentResponseDto> contentList = contentService.getContentList();
        return ResponseEntity.ok(contentList);
    }

    @PostMapping("")
    public ResponseEntity<String> addContent(@RequestBody ContentRequestDto contentRequestDto){
        contentService.addContent(contentRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body("Content created successfully");
    }

    @PutMapping("/{contentNo}")
    public ResponseEntity<String> modifyContent(@PathVariable Long contentNo, @RequestBody Content content) {
        return ResponseEntity.ok("Content modified successfully");
    }

    @DeleteMapping("/{contentNo}")
    public ResponseEntity<String> removeContent(@PathVariable Long contentNo) {
        return ResponseEntity.ok("Content removed successfully");
    }

}

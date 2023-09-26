package com.pgrrr.threelines.service;

import com.pgrrr.threelines.domain.Content;
import com.pgrrr.threelines.dto.ContentResponseDto;
import com.pgrrr.threelines.repository.ContentRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
@Transactional(readOnly = true)
public class ContentService {

    private final ContentRepository contentRepository;

    public List<ContentResponseDto> getContentList() {
        return contentRepository.findAll().stream()
            .map(Content::toDto)
            .collect(Collectors.toList());
    }
    
}

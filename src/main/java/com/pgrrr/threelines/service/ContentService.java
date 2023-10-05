package com.pgrrr.threelines.service;

import com.pgrrr.threelines.domain.Content;
import com.pgrrr.threelines.dto.ContentRequestDto;
import com.pgrrr.threelines.dto.ContentResponseDto;
import com.pgrrr.threelines.repository.ContentRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.Disposable;
import reactor.core.publisher.Mono;

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

    @Transactional
    public void addContent(ContentRequestDto contentRequestDto) {
        contentRepository.findByContentAddrAndContentLang(contentRequestDto.getContentAddr(), contentRequestDto.getContentLang())
                .ifPresent(content -> {
                    throw new IllegalArgumentException("Content already exists");
                    });

        WebClient webClient = WebClient.builder()
                .baseUrl("https://localhost:5000/api")
                .build();

        Mono<ContentRequestDto> responseMono = webClient.get()
                .uri(uriBuilder -> uriBuilder.path("/summary")
                        .queryParam("contentAddr", contentRequestDto.getContentAddr())
                        .queryParam("contentLang", contentRequestDto.getContentLang())
                        .build())
                .retrieve()
                .bodyToMono(ContentRequestDto.class);

        responseMono.subscribe(
                response -> {
                    contentRepository.save(response.toEntity());
                },
                error -> {
                    throw new IllegalArgumentException("Invalid content address or language");
                }
        );
    }
}

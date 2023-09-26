package com.pgrrr.threelines.service;

import java.util.List;
import java.util.stream.Collectors;

import com.pgrrr.threelines.domain.Subscription;
import com.pgrrr.threelines.dto.SubscriptionResponseDto;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pgrrr.threelines.repository.SubscriptionRepository;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
@Transactional(readOnly = true)
public class SubscriptionService {

    private final SubscriptionRepository subscriptionRepository;

    public List<SubscriptionResponseDto> getSubscriptionList() {
        return subscriptionRepository.findAll().stream()
                     .map(Subscription::toDto)
                     .collect(Collectors.toList());
    }

    public void addSubscription(Subscription subscription) {

    }
}

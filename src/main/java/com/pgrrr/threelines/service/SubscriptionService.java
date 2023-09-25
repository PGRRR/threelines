package com.pgrrr.threelines.service;

import java.util.LinkedList;
import java.util.List;

import com.pgrrr.threelines.domain.Subscription;
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

    public List<String> getSubscriptionList() {
        return new LinkedList<>();
    }

    public void addSubscription(Subscription subscription) {

    }
}

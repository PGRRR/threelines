package com.pgrrr.threelines.service;

import com.pgrrr.threelines.repository.SubscriptionRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedList;
import java.util.List;

@Service
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
@Transactional(readOnly = true)
public class ContentService {

    private final SubscriptionRepository subscriptionRepository;

    public List<String> getSubscriptionList() {
        return new LinkedList<>();
    }
    
}

package com.pgrrr.threelines.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pgrrr.threelines.repository.ViewRepository;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
@Transactional(readOnly = true)
public class ViewService {

    private final ViewRepository viewRepository;

    public List<String> getSubscriptionList() {
        return new LinkedList<>();
    }
    
}

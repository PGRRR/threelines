package com.pgrrr.threelines.controller;

import com.pgrrr.threelines.domain.Subscription;
import com.pgrrr.threelines.dto.SubscriptionResponseDto;
import com.pgrrr.threelines.service.SubscriptionService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subscriptions")
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class SubscriptionController {

    private final SubscriptionService subscriptionService;

    @GetMapping("")
    public ResponseEntity<List<SubscriptionResponseDto>> getSubscriptionList(){
        List<SubscriptionResponseDto> subscriptionList = subscriptionService.getSubscriptionList();
        return ResponseEntity.ok(subscriptionList);
    }

    @PostMapping("")
    public ResponseEntity<String> addSubscription(@RequestBody Subscription subscription){
        subscriptionService.addSubscription(subscription);
        return ResponseEntity.status(HttpStatus.CREATED).body("Subscription created successfully");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> modifySubscription(@PathVariable Long id, @RequestBody Subscription subscription) {
        return ResponseEntity.ok("Subscription modified successfully");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> removeSubscription(@PathVariable Long id) {
        return ResponseEntity.ok("Subscription removed successfully");
    }

}

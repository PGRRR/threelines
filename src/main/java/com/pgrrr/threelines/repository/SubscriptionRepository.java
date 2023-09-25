package com.pgrrr.threelines.repository;

import com.pgrrr.threelines.domain.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepository extends JpaRepository<Subscription, String>{}
package com.aibles.kafka.retry.repository;

import com.aibles.kafka.retry.entity.FailedMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FailedMessageRepository extends JpaRepository<FailedMessage, Long> {
}


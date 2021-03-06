package com.smsGenerator.repos;

import com.smsGenerator.domain.SMSQueue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SMSQueueRepos extends JpaRepository<SMSQueue, Integer> {
}
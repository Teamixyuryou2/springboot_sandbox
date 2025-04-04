package com.ghost.dummyproject.repository;

import com.ghost.dummyproject.model.MessageHistory;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MessageHistoryRepository extends MongoRepository<MessageHistory, String> {
}

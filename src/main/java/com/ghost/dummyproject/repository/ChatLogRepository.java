package com.ghost.dummyproject.repository;

import com.ghost.dummyproject.model.ChatLog;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ChatLogRepository extends MongoRepository<ChatLog, String> {

}

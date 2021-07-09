package io.ep2p.eleuthserver.database.repository;

import io.ep2p.eleuthserver.database.entity.ConversationMessageEntity;
import io.ep2p.somnia.config.dynamic.DynamicRepository;
import io.ep2p.somnia.storage.SomniaRepository;

import java.io.Serializable;

// TODO
@DynamicRepository
public interface ConversationMessageRepository extends SomniaRepository<Serializable, ConversationMessageEntity> {
}

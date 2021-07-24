package io.ep2p.eleuthserver.database.repository;

import io.ep2p.eleuthserver.data.SignedData;
import io.ep2p.eleuthserver.data.message.ConversationMessage;
import io.ep2p.eleuthserver.database.entity.ConversationMessageEntity;
import io.ep2p.somnia.config.dynamic.DynamicRepository;
import io.ep2p.somnia.storage.SomniaRepository;

@DynamicRepository
public interface ConversationMessageRepository extends SomniaRepository<SignedData<ConversationMessage>, ConversationMessageEntity> {
}

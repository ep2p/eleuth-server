package io.ep2p.eleuthserver.database.repository;

import io.ep2p.eleuthserver.data.SignedData;
import io.ep2p.eleuthserver.data.message.PayloadMessage;
import io.ep2p.eleuthserver.database.entity.MessageDataEntity;
import io.ep2p.somnia.config.dynamic.DynamicRepository;
import io.ep2p.somnia.storage.SomniaRepository;

@DynamicRepository
public interface MessageDataRepository extends SomniaRepository<SignedData<PayloadMessage>, MessageDataEntity> {
}

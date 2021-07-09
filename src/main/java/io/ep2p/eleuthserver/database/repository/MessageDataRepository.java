package io.ep2p.eleuthserver.database.repository;

import io.ep2p.eleuthserver.database.entity.MessageDataEntity;
import io.ep2p.somnia.config.dynamic.DynamicRepository;
import io.ep2p.somnia.storage.SomniaRepository;

import java.io.Serializable;

// TODO
@DynamicRepository
public interface MessageDataRepository extends SomniaRepository<Serializable, MessageDataEntity> {
}

package io.ep2p.eleuthserver.database.entity;

import io.ep2p.somnia.annotation.SomniaDocument;
import io.ep2p.somnia.model.EntityType;
import io.ep2p.somnia.model.SomniaEntity;

import java.io.Serializable;

// TODO
@SomniaDocument(type = EntityType.DISTRIBUTE, uniqueKey = true)
public class MessageDataEntity extends SomniaEntity<Serializable> {
}

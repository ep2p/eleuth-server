package io.ep2p.eleuthserver.database.entity;

import io.ep2p.eleuthserver.data.SignedData;
import io.ep2p.eleuthserver.data.message.PayloadMessage;
import io.ep2p.somnia.annotation.SomniaDocument;
import io.ep2p.somnia.model.EntityType;
import io.ep2p.somnia.model.SomniaEntity;

@SomniaDocument(type = EntityType.DISTRIBUTE, uniqueKey = true)
public class MessageDataEntity extends SomniaEntity<SignedData<PayloadMessage>> {
}

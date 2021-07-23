package io.ep2p.eleuthserver.database.entity;

import io.ep2p.eleuthserver.data.SignedData;
import io.ep2p.eleuthserver.data.message.ConversationMessage;
import io.ep2p.somnia.annotation.SomniaDocument;
import io.ep2p.somnia.model.EntityType;
import io.ep2p.somnia.model.SomniaEntity;

import java.io.Serializable;

@SomniaDocument(type = EntityType.HIT)
public class ConversationMessageEntity extends SomniaEntity<SignedData<ConversationMessage>> {
}

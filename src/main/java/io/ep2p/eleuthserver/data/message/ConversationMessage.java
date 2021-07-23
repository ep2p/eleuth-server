package io.ep2p.eleuthserver.data.message;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ConversationMessage implements Serializable {
    private String conversationId;
    private String messageId;
    private Date createdAt;
}

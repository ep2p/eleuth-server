package io.ep2p.eleuthserver.data.message;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PayloadMessage implements Serializable {
    private String body;
    private Date date;
    private String keyId;
}

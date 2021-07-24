package io.ep2p.eleuthserver.data.message;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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

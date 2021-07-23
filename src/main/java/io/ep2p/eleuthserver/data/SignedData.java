package io.ep2p.eleuthserver.data;

import lombok.*;

import java.io.Serializable;
import java.math.BigInteger;

/**
 * Data model wrapper with signature support
 * @param <D> Serializable data object which is signed
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class SignedData<D extends Serializable> implements Serializable {
    private D data;
    private String signature;
    private BigInteger key;
    private String publicKey;
}

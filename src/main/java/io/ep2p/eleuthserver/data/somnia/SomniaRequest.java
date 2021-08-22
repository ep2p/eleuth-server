package io.ep2p.eleuthserver.data.somnia;

import io.ep2p.eleuthserver.data.SignedData;
import io.ep2p.kademlia.node.Node;
import io.ep2p.somnia.decentralized.SomniaConnectionInfo;
import io.ep2p.somnia.model.SomniaKey;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SomniaRequest {
    private SomniaKey key;
    private SignedData<Node<BigInteger, SomniaConnectionInfo>> sender;
    private SignedData<ProvableRequester> requester;
}

package io.ep2p.eleuthserver.data.somnia;

import io.ep2p.kademlia.node.Node;
import io.ep2p.somnia.decentralized.SomniaConnectionInfo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProvableRequester extends Node<BigInteger, SomniaConnectionInfo> {
    private BigInteger key;
    private String name;
    private Date expiration;
}

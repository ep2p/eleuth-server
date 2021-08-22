package io.ep2p.eleuthserver.service;

import io.ep2p.eleuthserver.data.SignedData;
import io.ep2p.eleuthserver.data.somnia.ProvableRequester;
import io.ep2p.kademlia.node.Node;
import io.ep2p.somnia.decentralized.SomniaConnectionInfo;
import io.ep2p.somnia.model.SomniaKey;

import java.math.BigInteger;

public interface RequestVerifierService {
    boolean isVerifiedRequester(SignedData<ProvableRequester> requester, SomniaKey somniaKey);
    SignedData<ProvableRequester> getProvableRequester(SomniaKey somniaKey);
    boolean isVerifiedData(SignedData<?> signedData);
    SignedData<Node<BigInteger, SomniaConnectionInfo>> getSignedNode();
}

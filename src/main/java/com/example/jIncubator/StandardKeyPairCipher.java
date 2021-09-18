package com.example.jIncubator;

import com.example.jIncubator.core.CipherUtils;
import sun.security.rsa.RSAKeyPairGenerator;

import java.nio.charset.StandardCharsets;
import java.security.KeyPair;
import java.security.KeyPairGenerator;

public class StandardKeyPairCipher {

    public static void main(String[] args) {

        KeyPair keyPair = new RSAKeyPairGenerator().generateKeyPair();
        System.out.println("Private key"+","+keyPair.getPrivate().getAlgorithm()+","+keyPair.getPrivate().getEncoded());
        System.out.println("Public key"+keyPair.getPublic().getAlgorithm()+","+keyPair.getPublic().getEncoded());

        CipherUtils cipherUtils= new CipherUtils();
        byte[] encryptedBytes=cipherUtils.encrypt(keyPair.getPublic(),"GG message123");
        
        byte[] decryptedBytes=cipherUtils.decrypt(keyPair.getPrivate(),encryptedBytes);
        System.out.println("after decryption "+new String(decryptedBytes, StandardCharsets.UTF_8));
                

    }
}

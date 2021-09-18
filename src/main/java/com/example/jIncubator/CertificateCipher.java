package com.example.jIncubator;

import com.example.jIncubator.core.CipherUtils;
import com.sun.security.cert.internal.x509.X509V1CertImpl;
import sun.security.rsa.RSAKeyPairGenerator;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.security.cert.Certificate;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;

public class CertificateCipher {

    public static void main(String[] args) {

        KeyPair keyPair = new RSAKeyPairGenerator().generateKeyPair();
        System.out.println("Private key"+","+keyPair.getPrivate().getAlgorithm()+","+keyPair.getPrivate().getEncoded());
        System.out.println("Public key"+keyPair.getPublic().getAlgorithm()+","+keyPair.getPublic().getEncoded());

      /*  try {
            Cipher cipher= Cipher.getInstance("RSA");
            
            cipher.init(Cipher.ENCRYPT_MODE, (Key) new X509V1CertImpl());
        } catch (NoSuchAlgorithmException |NoSuchPaddingException e) {
            e.printStackTrace();
        } 
*/

    }
}

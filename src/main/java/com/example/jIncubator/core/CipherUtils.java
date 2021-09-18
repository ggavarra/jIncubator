package com.example.jIncubator.core;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class CipherUtils {
    
    private Cipher cipher;



    public CipherUtils() {
        try {
            cipher=Cipher.getInstance("RSA");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        }

    }

    public byte[] encrypt(Key encryptionKey,String secretMessage){
        byte[] encryptedBytes = new byte[0];
        try {
            cipher.init(Cipher.ENCRYPT_MODE,encryptionKey);
            encryptedBytes = cipher.doFinal(secretMessage.getBytes(StandardCharsets.UTF_8));
            String encodedMessage = Base64.getEncoder().encodeToString(encryptedBytes);
            System.out.println("encrypted bytes"+encodedMessage);
            
        } catch (InvalidKeyException | IllegalBlockSizeException | BadPaddingException e) {
            e.printStackTrace();
        }

        return encryptedBytes;
    }

    public byte[] decrypt(Key decryptionKey, byte[] encryptedBytes){
        byte[] decryptedBytes = new byte[0];
        try {
            cipher.init(Cipher.DECRYPT_MODE,decryptionKey);
            decryptedBytes = cipher.doFinal(encryptedBytes);
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        }
        
        return decryptedBytes;
    }
}

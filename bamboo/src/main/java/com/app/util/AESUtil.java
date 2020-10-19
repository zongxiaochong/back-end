package com.app.util;

import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/**
 * AES加密算法
 * @author weizong
 *
 */
public class AESUtil {
	
	/*
	 * 生成密钥
	 */
	public static byte[] initKey() {
		KeyGenerator keyGen;
		try {
			keyGen = KeyGenerator.getInstance("AES");
			keyGen.init(256);  //192 256
			SecretKey secretKey = keyGen.generateKey();
			return secretKey.getEncoded();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/*
	 * AES 加密
	 */
	public static byte[] encrypt(String str, byte[] key) throws Exception{
		if (str == null) {
			return null;
		}
		SecretKey secretKey = new SecretKeySpec(key, "AES");
		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.ENCRYPT_MODE, secretKey);
		byte[] cipherBytes = cipher.doFinal(str.getBytes());
		return cipherBytes;
	}
	
	
	/*
	 * AES 解密
	 */
	public static byte[] decrypt(String str, byte[] key) throws Exception{
		if (str == null) {
			return null;
		}
		SecretKey secretKey = new SecretKeySpec(key, "AES");
		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.DECRYPT_MODE, secretKey);
		byte[] plainBytes = cipher.doFinal(str.getBytes());
		return plainBytes;
	}
	

}

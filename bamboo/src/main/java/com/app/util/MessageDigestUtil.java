package com.app.util;

import java.io.FileInputStream;
import java.security.DigestInputStream;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/**
 * 信息加密
 * @author weizong
 *
 */
public class MessageDigestUtil {
	
	/**
	 * MD5加密
	 * @param data
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	public static String encryptMD5(String str) {
		if (str == null) {
			return null;
		}
		byte[] data = str.getBytes();
		MessageDigest md5 = null;
		String resultString = null;
		try {
			md5 = MessageDigest.getInstance("MD5");
			md5.update(data);
			byte[] resultBytes = md5.digest();
			resultString = fromBytesToHex(resultBytes);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return resultString;
	}
	
	
	/**
	 * MD5加密文件
	 * @param path
	 * @return
	 * @throws Exception
	 */
	public static String getMD5OfFile(FileInputStream fis) throws Exception {
		//FileInputStream fis = new FileInputStream(new File(path));
		DigestInputStream dis = new DigestInputStream(fis, MessageDigest.getInstance("MD5"));
		// 流输入
		byte[] buffer = new byte[1024];
		int read = dis.read(buffer, 0, 1024);
		while (read != -1){
			read = dis.read(buffer, 0, 1024);
		}
		MessageDigest md = dis.getMessageDigest();
		byte[] resultBytes = md.digest();
		String resultString = fromBytesToHex(resultBytes);
		if (dis != null) {
			dis.close();
		}
		return resultString;
	}
	
	/**
	 * SHA-512加密
	 * @param data
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	public static String encryptSHA(String str) throws NoSuchAlgorithmException{
		if (str == null) {
			return null;
		}
		byte[] data = str.getBytes();
		MessageDigest sha = MessageDigest.getInstance("SHA-512");
		sha.update(data);
		byte[] resultBytes = sha.digest();
		
		String resultString = fromBytesToHex(resultBytes);
		return resultString;
	}
	
	/**
	 * 获取HmacSHA512加密key
	 * @return
	 * @throws Exception
	 */
	public static byte[] initHmacKey() throws Exception{
		KeyGenerator keyGen = KeyGenerator.getInstance("HmacSHA512");
		SecretKey secretKey = keyGen.generateKey();
		return secretKey.getEncoded();
	}
	
	/**
	 * HmacSHA512加密
	 * @param data
	 * @param key
	 * @return
	 * @throws NoSuchAlgorithmException
	 * @throws InvalidKeyException
	 */
	public static String encryptHmac(String str, byte[] key) throws NoSuchAlgorithmException, InvalidKeyException{
		if (str == null) {
			return null;
		}
		byte[] data = str.getBytes();
		SecretKey secretKey = new SecretKeySpec(key, "HmacSHA512");
		Mac mac = Mac.getInstance("HmacSHA512");
		mac.init(secretKey);
		byte[] resultBytes = mac.doFinal(data);
		
		String resultString = fromBytesToHex(resultBytes);
		return resultString;
	}
	
	
	/**
	 * 对称编码
	 * @param resultBytes
	 * @return
	 */
	public static String fromBytesToHex(byte[] resultBytes) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < resultBytes.length; i++) {
			if (Integer.toHexString(0xFF & resultBytes[i]).length() == 1) {
				builder.append("0").append(
						Integer.toHexString(0xFF & resultBytes[i]));
			} else {
				builder.append(Integer.toHexString(0xFF & resultBytes[i]));
			}
		}
		return builder.toString();
	}

}

package com.app.util;

import java.io.FileInputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD5加密算法
 * @author weizong
 *
 */
public class MD5Utils {
	
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

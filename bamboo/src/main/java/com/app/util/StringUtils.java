package com.app.util;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.Random;

/**
 * 字符串工具
 * @author weizong
 *
 */
public class StringUtils {
	
	
	
	/**
	 * 字节数组转换为base64编码
	 * @param buffer
	 * @return
	 */
	public static String byteArrayToBase64(byte[] buffer) {
		String result = null;
		if(buffer != null) {
			byte[] bytes = Base64.getEncoder().encode(buffer);
			try {
				result = new String(bytes, "utf-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	/**
	 * 获取指定长度的随机字符
	 * @param length
	 * @return
	 */
	public static String randomCode(int length) {
		StringBuilder sb = new StringBuilder();
		String str = "1,2,3,4,5,6,7,8,9,a,b,c,d,e,f,g,h,i,j,k,m,n,p,q,r,s,t,u,v,w,x,y,z,A,B,C,D,E,F,G,H,J,K,L,M,N,P,Q,R,S,T,U,V,W,X,Y,Z";
		String[] arr = str.split(",");
		Random random = new Random();
		for (int i = 0; i < length; i++) {
			int nextInt = random.nextInt(arr.length);
			sb.append(arr[nextInt]);
		}
		return sb.toString();
	}

}

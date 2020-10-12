package com.app;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Main {

	public static void main(String[] args) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
    }
	
}

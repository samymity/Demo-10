package com.example.demo.util;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
	public class password {
		public password() {
			String userPassword = "c/r+oDn7M/R0AS+Y797GAab5oGHoOJGH";
			String password = "VIUTSMS";
			try {
				StandardPBEStringEncryptor textEncryptor = new StandardPBEStringEncryptor();
				textEncryptor.setPassword(password);
				String y = textEncryptor.decrypt("c/r+oDn7M/R0AS+Y797GAab5oGHoOJGH");
				String encryptedResult = textEncryptor.encrypt(userPassword);
				System.out.println("ENC : " + encryptedResult);
				System.out.println(y);
				if (textEncryptor.decrypt(encryptedResult).equals(userPassword)) {
					// correct!
					System.out.println("Here you go - good");
				} else {
					// bad login!
					System.out.println("Here you go - bad");
				}
			} catch (Exception ex) {
				throw new RuntimeException(ex);
			}
		}
		public static void main(String[] args) {
			password ep = new password();
		}
	}
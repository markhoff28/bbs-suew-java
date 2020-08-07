package PasswordCheck;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;

public class PasswordCheck {
	private String password;
	public boolean login(String pw) {
		return password.equals(getMD5Hash(pw));
	}

	public boolean check(String password) {
		if (password.length() < 8) {
			return false;
		}
		int letterCount = 0, digitCount = 0, lowerCount = 0, upperCount = 0, specialCount = 0,
				specialOrNumberInMiddle = 0;
		for (int i = 0; i < password.length(); i++) {
			char c = password.charAt(i);
			if (Character.isLetter(c)) {
				letterCount++;
				if (Character.isUpperCase(c)) {
					upperCount++;
				} else {
					lowerCount++;
				}
			} else if (Character.isDigit(c)) {
				digitCount++;
				if ((i > 0) && (i < password.length() - 1)) {
					specialOrNumberInMiddle++;
				}
			} else {
				specialCount++;
				if ((i > 0) && (i < password.length() - 1)) {
					specialOrNumberInMiddle++;
				}
			}
		}
		return (letterCount >= 2) && (digitCount >= 2) && (lowerCount >= 1) && (upperCount >= 1) && (specialCount >= 1)
				&& (specialOrNumberInMiddle >= 1);
	}

	public String getMD5Hash(String text) {
		StringBuffer stringBuffer = new StringBuffer();
		Formatter formatter = new Formatter(stringBuffer);
		try {
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			md5.update(text.getBytes());
			for (byte b : md5.digest()) {
				formatter.format("%02x", b);
			}
		} catch (NoSuchAlgorithmException e) {
			System.out.println(e.getMessage());
		}
		return stringBuffer.toString();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = getMD5Hash(password);
	}
	
}

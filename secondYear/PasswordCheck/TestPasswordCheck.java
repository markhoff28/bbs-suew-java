package PasswordCheck;

public class TestPasswordCheck {

	public static void main(String[] args) {
		PasswordCheck myPassword = new PasswordCheck();
		System.out.println("1passw0rt - "
				+ (myPassword.check("1passw0rt") ? "Passwort ist gültig!" : "Passwort entspricht nicht den Kriterien!"));
		System.out.println("1passw0rt - MD5 : " + myPassword.getMD5Hash("1passw0rt"));
		System.out.println("AxB1&a8c - "
				+ (myPassword.check("AxB1&a8c") ? "Passwort ist gültig!" : "Passwort entspricht nicht den Kriterien!"));
		System.out.println("AxB1&a8c - MD5 : " + myPassword.getMD5Hash("AxB1&a8c"));
		myPassword.setPassword("1234");
		System.out.println("1235 - " +myPassword.login("1235"));
		System.out.println("1234 - " +myPassword.login("1234"));
	}

}

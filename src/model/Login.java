package model;

public class Login {
	private String user_name;
	private String pass;
	public Login(String user_name, String pass) {
		this.user_name = user_name;
		this.pass = pass;
	}
	public String getUser_name() {
		return user_name;
	}
	public String getPass() {
		return pass;
	}
}
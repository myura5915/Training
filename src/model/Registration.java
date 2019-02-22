package model;

public class Registration {
	private String user_name;
	private String pass;

	public Registration() {
	}

	public Registration(String user_name, String pass) {
		this.user_name = user_name;
		this.pass = pass;
	}

	public String getUser_name() {
		return user_name;
	}
	public String getPass() {
		return pass;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
}
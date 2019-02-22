package model;

import java.util.Date;

public class Account {

	private int id;
	private String user_name;
	private String pass;
	private Date insert_date;

	public Account() {
	}

	public Account(int id, String user_name, String pass, Date insert_date) {
		this.id = id;
		this.user_name = user_name;
		this.pass = pass;
		this.insert_date = insert_date;
	}

	public int getId() {
		return id;
	}

	public String getUser_name() {
		return user_name;
	}

	public String getPass() {
		return pass;
	}

	public Date getInsert_date() {
		return insert_date;
	}
}
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import javax.servlet.annotation.WebServlet;

import model.Account;
import model.Login;

@WebServlet("/AccountDao")

public class AccountDao {
	public Account findByLogin(Login login) {
		Connection conn = null;
		Account account = null;
		String url = "jdbc:mysql://localhost/lesson";
		String user = "root";
		String password = "collabo2017";
		try {
			//JDBCドライバを読み込む
			Class.forName("com.mysql.jdbc.Driver");

			//データベースに接続
			conn = DriverManager.getConnection(url, user, password);

			//SELECT文の準備
			String sql = "SELECT ID, USER_NAME, PASSWORD, INSERT_DATE FROM LOGIN_USER WHERE USER_NAME = ? AND PASSWORD = ?";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, login.getUser_name());
			pStmt.setString(2, login.getPass());

			//SELECTを実行し、結果表を取得
			ResultSet rs = pStmt.executeQuery();

			//一致したユーザーが存在した場合
			//そのユーザーを表すAccountインスタンスを生成
			if(rs.next()) {
				//結果表からデータを取得
//				String user_name = rs.getString("USER_NAME");
//				String pass = rs.getString("PASSWORD");

//				account = new Account(user_name, pass);

				int id = rs.getInt("ID");
				String user_name = rs.getString("USER_NAME");
				String pass = rs.getString("PASSWORD");
				Date insert_date = rs.getDate("INSERT_DATE");

				account = new Account(id, user_name, pass, insert_date);

			}
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			//データベースを切断
			if(conn != null) {
				try {
					conn.close();
				}catch(SQLException e) {
					e.printStackTrace();
					return null;
				}
			}
		}
		//見つかったユーザーまたはnullを返す
		return account;
	}
}
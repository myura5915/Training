import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Login;
import model.LoginLogic;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//フォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//リクエストパラメータの取得
		request.setCharacterEncoding("UTF-8");
		String user_name = request.getParameter("user_name");
		String pass = request.getParameter("password");

		//ログイン処理の実行
		Login login = new Login(user_name, pass);
		LoginLogic bo = new LoginLogic();
		boolean result = bo.execute(login);

		//ログイン処理の成否によって処理を分岐
		if(result) { //ログイン成功時

			//セッションスコープにユーザー名を保存
			HttpSession session = request.getSession();
			session.setAttribute("user_name",  user_name);

			//フォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/loginOK.jsp");
			dispatcher.forward(request, response);
		}else { //ログイン失敗時
			//リダイレクト
			response.sendRedirect("/Lesson/LoginfailedServlet");
		}
	}
}
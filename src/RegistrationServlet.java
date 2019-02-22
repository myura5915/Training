import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Registration;
import model.RegistrationLogic;

@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RegistrationServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/registration.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//リクエストパラメータの取得
		request.setCharacterEncoding("UTF-8");
		String user_name = request.getParameter("user_name");
		String pass = request.getParameter("password");
		Object error_message;
		HttpSession session = request.getSession();

		if (user_name == "" && pass == "") {
			error_message = "ユーザー名とパスワードが未入力です。";
			session.setAttribute("error_message", error_message);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/registrationError.jsp");
			dispatcher.forward(request, response);
			session.removeAttribute("error_message");

		}else if (user_name == "") {
			error_message = "ユーザー名が未入力です。";
			session.setAttribute("error_message", error_message);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/registrationError.jsp");
			dispatcher.forward(request, response);
			session.removeAttribute("error_message");

		}else if (pass == "") {
			error_message = "パスワードが未入力です。";
			session.setAttribute("error_message", error_message);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/registrationError.jsp");
			dispatcher.forward(request, response);
			session.removeAttribute("error_message");
		}else {

		//ユーザー登録処理の実行
		Registration registration = new Registration (user_name, pass);
		RegistrationLogic bo = new RegistrationLogic();
		bo.execute(registration);

		//フォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/registrationOK.jsp");
		dispatcher.forward(request, response);
		}
	}
}
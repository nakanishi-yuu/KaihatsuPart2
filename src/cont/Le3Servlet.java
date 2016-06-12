package cont;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Le3Servlet
 * @author hideki.hayashi
 */
@WebServlet("/Le3Servlet")
public class Le3Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Le3Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String pass = request.getParameter("password");
		RequestDispatcher rd;

		if(name.equals("admin") && pass.equals("4narin5")){

			Cookie cookies[] = ((HttpServletRequest)request).getCookies();
			if(cookies != null) {
				for(int i = 0; i < cookies.length; i++) {

					// クッキーの有効期間を0秒に設定する
					cookies[i].setMaxAge(0);
		                        ((HttpServletResponse)response).addCookie(cookies[i]);
				}
			}

			rd = request.getRequestDispatcher("/index4.jsp");
		} else {
            request.setAttribute("errorMessage",
                    "ユーザ名またはパスワードが違います");
			rd = request.getRequestDispatcher("/index3.jsp");
		}

		rd.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

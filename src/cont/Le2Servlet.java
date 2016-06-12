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
 * Servlet implementation class Le1Servlet
 * @author hideki.hayashi
 */
@WebServlet(name="Le2Servlet", urlPatterns="/Le2Servlet")
public class Le2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Le2Servlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("name");
		String pass = request.getParameter("password");
		RequestDispatcher rd;

		if(name.equals("admin") && pass.equals("RedChili")){
			  Cookie cookie = new Cookie("PW", "4narin5");
			  // 90日間有効なCookie
			  cookie.setMaxAge(60 * 3);
			  response.addCookie(cookie);
			rd = request.getRequestDispatcher("/index3.jsp");

		} else {
            request.setAttribute("errorMessage",
                    "ユーザ名またはパスワードが違います");
			rd = request.getRequestDispatcher("/index2.jsp");
		}

		rd.forward(request, response);


//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
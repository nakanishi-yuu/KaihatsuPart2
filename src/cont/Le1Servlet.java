package cont;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Le1Servlet
 * @author hideki.hayashi
 */
@WebServlet(name="Le1Servlet", urlPatterns="/Le1Servlet")
public class Le1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Le1Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 *
	 * 問題１；
	 * ２０１５年のバッドパスワードNo.1をネットで調べられればOK
	 * 「123456」
	 *
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 *
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("name");
		String pass = request.getParameter("password");
		RequestDispatcher rd;

		if(pass.equals("123456")){
			rd = request.getRequestDispatcher("/index2.jsp");

		} else {
            request.setAttribute("errorMessage",
                    "ユーザ名またはパスワードが違います");
			rd = request.getRequestDispatcher("/index.jsp");
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
package com.example;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test
 */
@WebServlet("/smalltest")
public class Test extends HttpServlet {

	public static final int Q1CORRECT = 2;
	public static final String Q2CORRECT = "getParameterValues";
	public static final String Q3CORRECT = "1235";

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		req.setCharacterEncoding("UTF-8");

		String q1 = req.getParameter("q1");
		String q2 = req.getParameter("q2");
		String q3 = String.join("", req.getParameterValues("q3"));

		int ans[] = {0,0,0};

		int correctAnswer = 0;

		if (Integer.parseInt(q1) == Q1CORRECT) {
			correctAnswer++;
			ans[0] = 1;
		}
		if (q2.equals(Q2CORRECT)) {
			correctAnswer++;
			ans[1] = 2;
		}

		if (Q3CORRECT.equals(q3)) {
			correctAnswer++;
			ans[2] = 3;
		}

		req.setAttribute("correctnum", correctAnswer);
		req.setAttribute("correctAns", ans);

		if (correctAnswer >= 3) {
			req.getRequestDispatcher("correct.jsp").forward(req, resp);
			//resp.sendRedirect("correct.html");

		}else{
			req.getRequestDispatcher("bad.jsp").forward(req, resp);
			//resp.sendRedirect("bad.html");
		}

	}

}

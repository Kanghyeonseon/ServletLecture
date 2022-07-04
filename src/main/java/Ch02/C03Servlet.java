package Ch02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Join.do")
public class C03Servlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/03MemberJoin.jsp").forward(req, resp);
		
	}
	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		
		String email = req.getParameter("email");
		String pwd = req.getParameter("pwd");
		String addr1 = req.getParameter("addr1");
		String addr2 = req.getParameter("addr2");
		
		System.out.println("email : " + email);
		System.out.println("pwd : " + pwd);
		System.out.println("addr1 : " + addr1);
		System.out.println("addr2 : " + addr2);
		
		req.getRequestDispatcher("/WEB-INF/03Result.jsp").forward(req, resp);
	}
}

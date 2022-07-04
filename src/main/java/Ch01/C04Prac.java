package Ch01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MemberJoin.do")
public class C04Prac extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		
		String userid = req.getParameter("userid");
		String email = req.getParameter("email");
		String addr1 = req.getParameter("addr1");
		String addr2 = req.getParameter("addr1");
		
		
		PrintWriter out = resp.getWriter();
		
		out.println("userid : " + userid + "<br>");
		out.println("email : " + email+ "<br>");
		out.println("addr1 : " + addr1 + "<br>");
		out.println("addr2 : " + addr2 + "<br>");
	}
	
}

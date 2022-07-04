package Ch01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetTest.do")
public class C02DoGetTest extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//req : 리퀘스트 내장객체 연결
		String userid = req.getParameter("userid");
		String pwd = req.getParameter("pwd");
		
		//헤더 추가 한글깨짐방지,HTML코드 추가
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		
		
		PrintWriter out = resp.getWriter();
		
		
		// request.getWriter -> out 내장객체를 가지고오게된다.
		out.println("userid : " + userid + "<br>");
		out.println("pwd : " + pwd);

	}

}

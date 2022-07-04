package Ch02;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/WEBINFTest.do")
public class C01Servlet extends HttpServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		System.out.println("TEST");
		
		//forward방식으로 request를 넘겨서 전달
		//WEB-INF의 파일을 서블릿이 연결하는 기본 방식
		RequestDispatcher dis = req.getRequestDispatcher("/WEB-INF/test.jsp");
		dis.forward(req, resp);
	}
}

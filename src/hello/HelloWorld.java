/**
 * 出席日とその科目の単位数
 *
 */

package hello;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TimeStatusTableDAO;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/hello")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plan");
		response.setCharacterEncoding("UTF-8");
//		response.getWriter().println("Hello,World!!");
		String seki_no = request.getParameter("seki_no");
		String subjects_cd = request.getParameter("subjectID");



//		System.out.println("seki_no:" + request.getParameter("seki_no"));
//		System.out.println("subjects_cd:" + request.getParameter("subjectID"));
//		System.out.println("start:" + request.getParameter("start"));
//		System.out.println("end:" + request.getParameter("end"));
		TimeStatusTableDAO tdao = new TimeStatusTableDAO();
		int count = tdao.selectCount(seki_no);
		response.getWriter().println(count);
//		return jsonファイル行けそう！！
	}
}

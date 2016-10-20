import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Newservlet
 */
@WebServlet("/Newservlet")
public class Newservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Newservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int firstnumber = Integer.parseInt(request.getParameter("firstnumber"));
		int secondnumber = Integer.parseInt(request.getParameter("secondnumber"));
		Getsum sum = new Getsum();
		Tran uppercase =new Tran();
		String lowercase = request.getParameter("name");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html><body>");
		out.println("<p>Welcome "+ uppercase.doTran(lowercase)+"!</p>");
		out.println("<p>The sum of this two numbers is " + sum.sum(firstnumber, secondnumber)  + ".</p></body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}
}

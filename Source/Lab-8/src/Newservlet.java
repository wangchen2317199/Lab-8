

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
		int sum = firstnumber +secondnumber;
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		String weather = "http://api.openweathermap.org/data/2.5/weather?lat=" + 39.0997 + "&lon=" + -94.627457 + "&APPID=15be36445a2ae01a56daef040c36b9f3";
		
		out.println("<!DOCTYPE html>");
		out.println("<html><body>");
		out.println("<p>The sum of this two numbers is " + sum + weather + ".</p></body></html>");
		
	
	     /*       String description = weather["weather"][0]["description"];
	            String basic = weather["weather"][0]["main"];
	            String temperature = weather["main"]["temp"] - 273.15;
	            String name = weather["name"];
	            $("#test").append("<p id = 'location'>Location: " + name + "</p>");
	            $("#test").append("<p id = 'weather'>Weather: " + description + ", "  + Math.ceil(temperature) + " degree C</p>");
		*/
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

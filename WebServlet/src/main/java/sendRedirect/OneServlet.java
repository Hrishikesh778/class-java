package sendRedirect;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class OneServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");

		PrintWriter out = resp.getWriter();

		ServletContext context = getServletContext();
		context.setAttribute("company", "IBM");

		out.println("Welcome to first servlet");
		out.println("<a href='servlet2'>visit</a>");
		out.close();
	}

}

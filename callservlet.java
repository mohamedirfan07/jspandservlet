package add;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebServlet("/call")//annotation config
public class callservlet extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		//USE ANY 1 OF THESE METHODS
		
		//=======REQUEST DISPATCHER METHOD==========
		//int k = (int) req.getAttribute("k");
		
		//=======SEND REDIRECT METHOD==========
		//int k = Integer.parseInt(req.getParameter("k"));
		
		//=======SESSION METHOD==========
		//HttpSession session = req.getSession();
		//int k = (int) session.getAttribute("k");
		
		k=k*k;
		PrintWriter out = res.getWriter();
		out.println("<html><body bgcolor='red'>");
		out.println("square of sum of two numbers is "+k);
		out.println("</body></html>");
	}

}

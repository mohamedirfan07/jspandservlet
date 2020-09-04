package add;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//@WebServlet("/add") //annotation config
public class addservlet extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i+j;
		
		//USE ANY 1 OF THESE METHODS
		
		//=======REQUEST DISPATCHER METHOD==========
		//req.setAttribute("k",k);
		//RequestDispatcher rd = req.getRequestDispatcher("call");
		//rd.forward(req, res);
		
		//=======SEND REDIRECT METHOD================
		//res.sendRedirect("call?k="+k);
		
		//=======SESSION METHOD===================
		//HttpSession session =req.getSession();
		//session.setAttribute("k", k);
		//res.sendRedirect("call");
}
}

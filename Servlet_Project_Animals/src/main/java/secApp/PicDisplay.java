package secApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class PicDisplay extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter out=res.getWriter();
		out.println("<html><head><style>"+"img{"+"width:728px;"+"height:484px;"+"}"+"</style><body>");
		out.println("<h1>your beautiful pic</h1>");
		out.println("<img src='pic1.jpg'>");
	}

}
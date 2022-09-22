package secApp;	

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Friendpic extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String []arr= {"pic1.jpg","pic2.jpg","pic3.jpg","pic4.jpg"};
		
		Random r=new Random();
		int ran=r.nextInt(arr.length);
		PrintWriter out=res.getWriter();
		out.println("<html><head><style>"+"img{"+"width:728px;"+"height:484px;"+"}"+"</style><body>");
		out.println("<h1>your friend beautiful pic</h1>");
		out.println("<img src='"+arr[ran]+"'>");
	}

}
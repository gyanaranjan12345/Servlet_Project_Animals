 package secApp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Pic extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("animal");//extracting from data
		String [] arr= {"pic1.jpg","pic2.jpg","pic3.jpg","pic4.jpg"};
		List<String> list=new ArrayList();
		list.add("monkey");
		list.add("tiger");
		list.add("donkey");
		list.add("deer");
		PrintWriter out=res.getWriter();
		out.println("<html><head><style>"+"img{"+"width:728px;"+"height:484px;"+"}"+"</style><body>");
		out.println("<h1>your beautiful pic</h1>");
		out.println("<img src='"+arr[list.indexOf(name.toLowerCase())]+"'>");
	}

}
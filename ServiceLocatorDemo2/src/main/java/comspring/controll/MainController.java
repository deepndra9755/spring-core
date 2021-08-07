package comspring.controll;

import java.awt.print.Printable;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.service.ServiceImpl;


public class MainController extends HttpServlet {
	ApplicationContext ctx;
	ServiceImpl lop;
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		 ctx=new ClassPathXmlApplicationContext("com/spring/cfg/applicationContext.xml");
	}
    public MainController() {
     
     System.out.println("constructor of main servlet execute");
    }

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        int id=Integer.parseInt(request.getParameter("id"));
        ServiceImpl lop=ctx.getBean("kioo",ServiceImpl.class);
        String ouuut=lop.score(id);
       // response.setContentType("text/html");
        request.setAttribute("score",ouuut);
        RequestDispatcher rd=request.getRequestDispatcher("result.jsp");
	    rd.forward(request, response);
//        PrintWriter pw= response.getWriter();
//        pw.println("<h1>"+ouuut+"</h1>");
	  
	  
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

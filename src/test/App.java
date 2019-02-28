package test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Date;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.apache.log4j.Logger;

/**
 * Servlet implementation class App
 */
@WebServlet("/App")
public class App extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
//final static Logger logger = Logger.getLogger(App.class);
    /**
     * @see HttpServlet#HttpServlet()
     */
    public App() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	   
//logger.debug("I am piggy backing: " + System.currentTimeMillis());;
	   File file = new File("C:\\Users\\mscarpac\\OneDrive - Capgemini\\Documents\\S-592700 Remediate XML Security Issue\\log4j-application.log");
	   try(FileWriter fw = new FileWriter(file);){
	   Date currentDate = new Date(System.currentTimeMillis());
	   fw.write(currentDate.toString());
	   fw.write("\n");
	   Enumeration<String> e = request.getHeaderNames();
	   while(e.hasMoreElements()){
	      String param = (String) e.nextElement();
	      fw.write(param + ": ");
	      fw.write(request.getHeader(param));
	      fw.write("\n");
	   }
	   fw.flush();
	   }catch(Exception ex){
	      ex.printStackTrace();
	   }
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	   
	  // OutputStream os = new OutputStream();
	   System.out.println("Inside Post");
	   
		doGet(request, response);
	}

}

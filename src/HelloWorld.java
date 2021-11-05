import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class HelloWorld
 */
@WebServlet(description = "Prints hello world to a browser window", 
            urlPatterns = { "/HelloWorld" })
public class HelloWorld extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;
	private static final String CONT_TYPE = "text/html;charset=UTF-8";
	private static final String MSG =
			"<!DOCTYPE html><html>" +
			"<head><title>Tomcat Hello!</title></head><body>" +
			"<h1>Hello, World</h1>" +
			"<p>From Tomcat!</p>";
	private static final String END_HTML = "</body></html>";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorld() {
        super();
    } // end constructor
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, 
	 * HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException {
		
		response.setContentType( CONT_TYPE );
		PrintWriter out = response.getWriter();
		
		out.print( MSG );
		out.print( "Your message goes here" );
		out.println( END_HTML );
		
		out.close();	// Close the writer
		
	} // end doGet()
	

} // end class HelloWorld
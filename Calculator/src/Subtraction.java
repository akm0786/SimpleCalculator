	import java.io.IOException;
	import java.io.PrintWriter;

	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	@WebServlet("/Subtraction")
	
public class Subtraction extends HttpServlet
{

	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
		{

		int a= (int) req.getAttribute("n1");
  
		int b=(int) req.getAttribute("n2");
		
		int c=a-b;
		
		PrintWriter pr= res.getWriter();
		pr.print("the addition is "+c);

	
	}
		}
	

	


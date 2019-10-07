package test;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Input
 */
@WebServlet("/Input")
public class Input extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Input() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		pw.append("<html><head><meta charset=\"utf-8\"/><title>Input Servlet</title></head><body>");
		pw.append("<h2>");
		if(request.getParameter("name") != null){
			pw.append("<h2>");
			pw.append(("Hallo "+request.getParameter("name")));
			pw.append("</h2>");
		}
		else{
			pw.append("Hallo du da");
		}
		pw.append("</h2>");
		pw.append("<form method=\"post\">");
		pw.append("<input type=\"text\" name=\"name\" placeholder=\"Wie ist dein Name?\"/>");
		pw.append("<input type=\"submit\">");
		pw.append("</form>");
		
		
		pw.append("</body></html>");

	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

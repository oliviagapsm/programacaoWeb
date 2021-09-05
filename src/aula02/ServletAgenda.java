package aula02;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletAgenda
 */
@WebServlet("/ServletAgenda")
public class ServletAgenda extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAgenda() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	PrintWriter saida = resp.getWriter();
    	saida.write("<HTML><BODY>");
    	saida.write("Os dados registrados na agenda são: <br>");
    	Enumeration<String> nomesParametros = req.getParameterNames();
    	while (nomesParametros.hasMoreElements()) {
			saida.write(req.getParameter(nomesParametros.nextElement().toString()));
			saida.write(", ");
			
		}
		
			
	}
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	doGet(req, resp);
    }
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	//protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//request.getSession().setAttribute("nome", request.getParameter("nome"));
		//request.getSession().setAttribute("telefone", request.getParameter("telefone"));
		//request.getSession().setAttribute("dataNascimento", request.getParameter("dataNascimento"));
		
		//response.sendRedirect("DadosAgenda.jsp");
		
		
	//}

}

package aula02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletPaginaAgenda
 */
@WebServlet("/ServletPaginaAgenda")
public class ServletPaginaAgenda extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPaginaAgenda() {
        super();
        // TODO Auto-generated constructor stub
    }
 

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter saida = response.getWriter();
			saida.write("<HTML><BODY>");
			saida.write("<form action=\"ServletAgenda\" method=\"post\">");
			saida.write("<div>\r\n" + 
					" 		Nome\r\n" + 
					"        <input type=\"text\" name=\"nome\" />\r\n" + 
					"    </div>");
			saida.write("<div>\r\n" + 
					"        Telefone\r\n" + 
					"        <input type=\"text\" name=\"telefone\"/>\r\n" + 
					"    </div>");
			saida.write("<div>\r\n" + 
					"        Data de Nascimento\r\n" + 
					"        <input type=\"date\" name=\"dataNascimento\" />\r\n" + 
					"    </div>");
			saida.write("<button type=\"submit\">Enviar</button>\r\n" + 
					"    </form>");
			
	}
	

}

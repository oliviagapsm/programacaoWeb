package aula04;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletCalculadoraParametros
 */
@WebServlet("/ServletCalculadoraParametros")
public class ServletCalculadoraParametros extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCalculadoraParametros() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter saida = response.getWriter();
    	Enumeration<String> nomesParametros = request.getParameterNames();
    	if(nomesParametros.hasMoreElements()== false) {
    		saida.write("Passe seus parâmetros na URL");
    		return;
    	} 
    	
    	saida.write("A soma dos números: ");
    	int total = 0;
    	
    	while (nomesParametros.hasMoreElements()) {
    		String n = request.getParameter(nomesParametros.nextElement().toString());
			total += Integer.parseInt(n);
    		saida.write(n);
			if(nomesParametros.hasMoreElements() == true) {
				saida.write(" + ");
			}
			
		}
    	
    	saida.write("\nO total é: " + total);
    	saida.close();
	}

}

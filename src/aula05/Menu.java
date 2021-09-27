package aula05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Menu
 */
@WebServlet("/Menu")
public class Menu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Menu() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter resposta = response.getWriter();
		resposta.write("<html><body>");
		
		HttpSession sessao = request.getSession(false);

		
		if(sessao == null || sessao.getAttribute(Login.USUARIO) == null) {
			resposta.write("<a href=\"login.jsp\">Para acessar, faça seu Login!</a><br>");
		} else {
		
		resposta.write("<title>Menu de operações</title>");
		resposta.write("<b> Operações disponíveis</b><br>");
		resposta.write("<a href=\"cadastro.jsp\">1. Cadastro</a><br>");
		resposta.write("<br>");
		resposta.write("<br>");
		resposta.write("<form action=\"Logout\" method=\"post\">\r\n" +  
				"	<input type=\"submit\" value=\"Sair\">\r\n" + 
				"</form>");
		
		//Novas funcionalidade poderão ser incluídas aqui
		}
		
	}

}

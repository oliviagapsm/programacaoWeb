package avaliacao.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet(name = "LoginAvaliacao", urlPatterns = { "/LoginAvaliacao" })
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public static final String USUARIO =  "usuario";
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

		
		String nomeUsuario = request.getParameter(USUARIO);
		String senhaUsuario = request.getParameter("senha");
		
		
		if(autentica(nomeUsuario, senhaUsuario)) {
			HttpSession sessao = request.getSession();
			sessao.setAttribute(USUARIO, nomeUsuario);
			request.getRequestDispatcher("menuAvaliacao.jsp").forward(request, response);
		} else { 
			resposta.write("Usuário ou senha inválidos");  
		}
	}
	
	private boolean autentica(String nomeUsuario, String senhaUsuario) {
		if(nomeUsuario != null && nomeUsuario.equals("professor") &&  senhaUsuario != null && senhaUsuario.equals("Progweb2021")) {
			return true;
		}
		
		return false;
		
	}

}

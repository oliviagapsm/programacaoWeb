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
 * Servlet implementation class Cadastrotela2
 */
@WebServlet("/Cadastrotela2")
public class Cadastrotela2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cadastrotela2() {
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
		
		HttpSession sessao = request.getSession(false);
		
		if(sessao == null || sessao.getAttribute(Login.USUARIO) == null) {
			resposta.write("<a href=\"login.jsp\">Para acessar, faça seu Login!</a><br>");
		}
		
		resposta.write("<html>");
		resposta.write("<head>");
		resposta.write("<title>Dados Profissionais</title>");
		resposta.write("<h3>Dados Cadastrados:</h3>");
		resposta.write("Rua: " + request.getParameter("rua"));
		resposta.write("</head>");
		resposta.write("<body>");
		resposta.write("</body></html>");
	}

}

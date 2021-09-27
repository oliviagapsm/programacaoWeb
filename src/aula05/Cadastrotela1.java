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
 * Servlet implementation class Cadastrotela1
 */
@WebServlet("/Cadastrotela1")
public class Cadastrotela1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cadastrotela1() {
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
		resposta.write("</head>");
		resposta.write("<body>");
		resposta.write("Preencha os dados profissionais:"); 
		resposta.write("<form action=\"Cadastrotela2sessao\" method=\"post\">");
		resposta.write("Empresa: <input type=\"text\" name=\"nome\"><br>");  
		resposta.write("Endereço Profissional: <br>"); 
		resposta.write("Rua: <input type=\"text\" name=\"rua\"><br>"); 
		resposta.write("Complemento: <input type=\"text\" name=\"complemento\"><br>");
		resposta.write("Cidade: <input type=\"text\" name=\"cidade\"><br>");
		resposta.write("Cep: <input type=\"text\" name=\"cep\"><br>"); 
		resposta.write("Estado: <input type=\"text\" name=\"estado\"><br><br>"); 
		resposta.write("<input type=\"submit\" value=\"Confirmar\">"); 
		resposta.write("</form>");
		resposta.write("</body></html>");
		
	}

}

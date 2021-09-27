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
 * Servlet implementation class Cadastrotela1sessao
 */
@WebServlet("/Cadastrotela1sessao")
public class Cadastrotela1sessao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cadastrotela1sessao() {
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
		
		resposta.write("<html>");
		resposta.write("<head>");
		resposta.write("<title>Dados Profissionais</title>");
		resposta.write("</head>");
		resposta.write("<body>");
		
		HttpSession sessao = request.getSession(false);
		
		if(sessao == null || sessao.getAttribute(Login.USUARIO) == null) {
			resposta.write("<a href=\"login.jsp\">Para acessar, faça seu Login!</a><br>");
		} else {
			DadosPessoais dados = new DadosPessoais();
			
			dados.setNome(request.getParameter("nome"));
			dados.setSobrenome(request.getParameter("sobrenome"));
			dados.setRua(request.getParameter("rua"));
			dados.setComplemento(request.getParameter("complemento"));
			dados.setCidade(request.getParameter("cidade"));
			dados.setCep(request.getParameter("cep"));
			dados.setEstado(request.getParameter("estado"));
			
			sessao.setAttribute("dadosPessoais", dados);
			
			resposta.write("Preencha os dados profissionais:"); 
			resposta.write("<form action=\"Cadastrotela2sessao\" method=\"post\">");
			resposta.write("Empresa: <input type=\"text\" name=\"empresa\"><br>");  
			resposta.write("Endereço Profissional: <br>"); 
			resposta.write("Rua: <input type=\"text\" name=\"ruaEmpresa\"><br>"); 
			resposta.write("Complemento: <input type=\"text\" name=\"complementoEmpresa\"><br>");
			resposta.write("Cidade: <input type=\"text\" name=\"cidadeEmpresa\"><br>");
			resposta.write("Cep: <input type=\"text\" name=\"cepEmpresa\"><br>"); 
			resposta.write("Estado: <input type=\"text\" name=\"estadoEmpresa\"><br><br>"); 
			resposta.write("<input type=\"submit\" value=\"Confirmar\">"); 
			resposta.write("</form>");
			resposta.write("</body></html>");
			
		}
		
		
	}

}

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
 * Servlet implementation class Cadastrotela2sessao
 */
@WebServlet("/Cadastrotela2sessao")
public class Cadastrotela2sessao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cadastrotela2sessao() {
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
		resposta.write("<head>");
		resposta.write("<title>Confirmação Registro</title>");
		resposta.write("<head>");
		
		HttpSession sessao = request.getSession(false);
		
		if(sessao == null || sessao.getAttribute(Login.USUARIO) == null) {
			resposta.write("<a href=\"login.jsp\">Para acessar, faça seu Login!</a><br>");
			
		} else {
			resposta.write("<h3>Registro realizado com sucesso!</h3>");
			resposta.write("<b>Seus dados Pessoais:</b><br>");
			
			DadosPessoais dados = (DadosPessoais) sessao.getAttribute("dadosPessoais");
			
			if (dados == null) {
				resposta.write("<a href=\"login.jsp\">Dados incompletos, iniciar o sistema novamente.</a><br>");
			} else {
				resposta.write(dados.getNome() + " " + dados.getSobrenome());
				resposta.write("<br>");
				resposta.write(dados.getRua());
				resposta.write("<br>");
				resposta.write(dados.getComplemento());
				resposta.write("<br>");
				resposta.write(dados.getCidade());
				resposta.write("<br>");
				resposta.write(dados.getCep());
				resposta.write("<br>");
				resposta.write(dados.getEstado());
				resposta.write("<br>");
				resposta.write("<br>");
				resposta.write("<b>Seua dados Profissionais:</b><br>");
				resposta.write(request.getParameter("empresa"));
				resposta.write("<br>");
				resposta.write(request.getParameter("ruaEmpresa"));
				resposta.write("<br>");
				resposta.write(request.getParameter("complementoEmpresa"));
				resposta.write("<br>");
				resposta.write(request.getParameter("cidadeEmpresa"));
				resposta.write("<br>");
				resposta.write(request.getParameter("cepEmpresa"));
				resposta.write("<br>");
				resposta.write(request.getParameter("estadoEmpresa"));
				resposta.write("</body></html>");
			}
		}
	}

}

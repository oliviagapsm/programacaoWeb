package avaliacao.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import avaliacao.model.Disciplina;
import avaliacao.model.SistemaDisciplinas;

/**
 * Servlet implementation class Controlador
 */
@WebServlet("/Controlador")
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controlador() {
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
		String acao = request.getParameter("acao");
		
		SistemaDisciplinas sistema = (SistemaDisciplinas) getServletContext().getAttribute(ContextListener.SISTEMA_DISCIPLINAS);
		
		String resposta = "menuAvaliacao.jsp";
		request.setAttribute("isCadastrado", false);
		
		if ("cadastrar".equals(acao)) {
			resposta = "cadastroDisciplinas.jsp";
		} else if ("confirmarCadastro".equals(acao)) {
			Disciplina e = new Disciplina();
			e.setDisciplina(request.getParameter("disciplina"));
			e.setNota(Double.valueOf(request.getParameter("nota")));
			
			sistema.adicionar(e);
			
			request.setAttribute("lista", sistema.listarDisciplinas());
			request.setAttribute("isCadastrado", true);
			
			resposta = "cadastroDisciplinas.jsp";
		} else if ("listar".equals(acao)) {
			request.setAttribute("lista", sistema.listarDisciplinas());
			resposta = "listaDisciplinas.jsp";
		}
		
		request.getRequestDispatcher(resposta).forward(request, response);
	}

}

package avaliacao.controller;

import avaliacao.model.*;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextListener implements ServletContextListener{
	
	public static final String SISTEMA_DISCIPLINAS = "sistemaDisciplinas";

	@Override
	public void contextInitialized(ServletContextEvent event) {
		ServletContext context = event.getServletContext();
		context.setAttribute(SISTEMA_DISCIPLINAS, new SistemaDisciplinas());
	}

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		ServletContext context = event.getServletContext();
		context.removeAttribute(SISTEMA_DISCIPLINAS);
	}
}

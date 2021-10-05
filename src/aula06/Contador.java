package aula06;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Contador {
	private static int contagem = 0;
	public static void novoAcesso() {
		contagem += 1;
	}
	
	public static int getQuantidadeAcessos() {
		return contagem;
	}
	
	public static String getDataHora() {
		
		return LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
	}

	
}

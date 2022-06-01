package br.com.caelum.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrimeiraLogica	 implements Logica {

	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("Executando logica...");
		
		System.out.println("Retornando o nome da pagina JSP...");
		
		return "primeira-logica.jsp";
	}
}

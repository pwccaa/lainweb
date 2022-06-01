package br.com.caelum.mvc.logica;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.Contato;
import br.com.caelum.ContatoDao;

public class ListaContatosLogica implements Logica{

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<Contato> contatos = new ContatoDao().getLista();
	
		request.setAttribute("contatos", contatos);
		
		return "lista-contatos.jsp";
	}
}

package br.com.alura.carteira.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/teste") //@WebServlet Serve para mapear a servlet para o servidor
public class TesteServlet extends HttpServlet{
	
	@Override 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// O parametro HttpServletRequest "request" recebe requisi��es do navegador
		// O parametro HttpServletResponse "response" envia respostas ao navegador
		// O m�todo service nos possibilita receber e enviar informa��es ao navegador
		
		String nome = request.getParameter("Nome");
		response.getWriter().println("Nome: " + nome);
		// Para receber um par�metro utilizamo o sinal de interroga��o na URL "http://localhost:8080/Carteira/teste?Nome=Guilherme"
	}
	
}

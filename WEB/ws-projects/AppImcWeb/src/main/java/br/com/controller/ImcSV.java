package br.com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.model.Atleta;
import br.com.util.Calculo;


@WebServlet("/ImcSV")
public class ImcSV extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		
		Atleta atleta = new Atleta();
		
		atleta.setNome(request.getParameter("nome"));
		atleta.setSexo(request.getParameter("sexo"));
		atleta.setAltura(Double.parseDouble(request.getParameter("altura")));
		atleta.setPeso(Double.parseDouble(request.getParameter("peso")));
		atleta.setDtNascimento(Calculo.strToDate(request.getParameter("dtNascimento")));
		
		request.setAttribute("resultado", Calculo.relatorio(atleta));
		request.setAttribute("color", Calculo.getCor());
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}

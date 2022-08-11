package br.com.calculadora.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculadoraSV
 */
@WebServlet("/CalculadoraSV")
public class CalculadoraSV extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");

		// Entrada dos dados
		double valor1 = Double.parseDouble(request.getParameter("valor1"));
		double valor2 = Double.parseDouble(request.getParameter("valor2"));
		String operador = request.getParameter("btn");

		// Processamento
		String res;

		switch (operador) {
		case "+":
			res = valor1 + " + " + valor2 + " + " + (valor1 + valor2);
			break;
		case "-":
			res = valor1 + " - " + valor2 + " - " + (valor1 - valor2);
			break;
		case "/":
			res = valor1 + " / " + valor2 + " / " + (valor1 / valor2);
			break;
		case "*":
			res = valor1 + " * " + valor2 + " * " + (valor1 * valor2);
			break;
		default:
			res = "Operador inválido";

		}

		// Saída dos dados
		request.setAttribute("resultado", res);
		request.getRequestDispatcher("index.jsp").forward(request, response);

	}
}

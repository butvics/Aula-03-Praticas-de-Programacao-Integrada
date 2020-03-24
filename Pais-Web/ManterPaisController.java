package br.usjt.OO;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ManterPais.do")
public class ManterPaisController extends HttpServlet {
	private static final long serialVersionUID = 1L;

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
		String pNomePais = request.getParameter("nome");
		String pPopulacaoPais = request.getParameter("populacao");
		String pAreaPais = request.getParameter("area");
		
		//instanciar o javabean
		Pais pais = new Pais();
		pais.setNomePais(pNomePais);
		pais.setPopulacaoPais(pPopulacaoPais);
		pais.setAreaPais(pAreaPais);
		
		//instanciar o service
		PaisService cs = new PaisService();
		cs.criar(pais);
		pais = cs.carregar(pais.getIdPais());
		
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Pais Cadastrado</title></head><body>");
		out.println(	"id: "+pais.getIdPais()+"<br>");
		out.println(	"nome: "+pais.getNomePais()+"<br>");
		out.println(	"população: "+pais.getPopulacaoPais()+"<br>");
		out.println(	"area: "+pais.getAreaPais()+"<br>");
	    out.println("</body></html>");
		
	}

}
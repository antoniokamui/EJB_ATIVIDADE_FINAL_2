package br.com.fiap.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.ws.ComentarioProduto;
import br.com.fiap.ws.ComentarioProdutoWebService;
import br.com.fiap.ws.ComentarioProdutoWebServiceProxy;

/**
 * Servlet implementation class ComentarioProdutoServlet
 */
@WebServlet("/ComentarioProdutoServlet")
public class ComentarioProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ComentarioProdutoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Calendar dtHoje = Calendar.getInstance();
		try {
			String data = request.getParameter("data");
			SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");			
			dtHoje.setTime(formato.parse(data));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		String titulo = request.getParameter("titulo");
		String assunto = request.getParameter("assunto");
		int avaliacao = Integer.parseInt(request.getParameter("avaliacao"));
		String comentarioProduto = request.getParameter("comentarioProduto");
		

		PrintWriter out = response.getWriter();
		try {
			
			ComentarioProdutoWebService proxy = new ComentarioProdutoWebServiceProxy();;
			proxy.inserirComentarioProduto(dtHoje, titulo, assunto, comentarioProduto, avaliacao);

			request.setAttribute("lista", proxy.listarComentariosProdutos());
			request.getRequestDispatcher("lista.jsp").forward(request, response);
		} catch (Exception e) {
			out.print(e.getMessage());
		}
	}

}

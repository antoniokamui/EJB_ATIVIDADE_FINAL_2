package br.com.fiap.ws;

import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface ComentarioProdutoWebService {

	@WebMethod
	void inserirComentarioProduto(@WebParam(name="data") Date data,	
						 @WebParam(name="titulo") String titulo,
						 @WebParam(name="assunto") String assunto,
						 @WebParam(name="comentario") String comentario,
						 @WebParam(name="avaliacao") Integer avaliacao);
	
	@WebMethod
	ComentarioProduto[] listarComentariosProdutos();
	
	
}

package br.com.fiap.ws;

import java.rmi.RemoteException;
import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName="ComentarioProdutoWebService/comentarioprodutooendpoint")
public class ComentarioProdutoWebServiceImpl implements ComentarioProdutoWebService {

	@Override
	@WebMethod
	public void inserirComentarioProduto(Date data, String titulo, String assunto, String comentario,
			Integer avaliacao) {
	
		
	}

	@Override
	@WebMethod
	public ComentarioProduto[] listarComentariosProdutos() {
		// TODO Auto-generated method stub
		return null;
	}


}

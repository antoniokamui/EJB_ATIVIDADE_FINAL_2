/**
 * ComentarioProdutoWebService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.fiap.ws;

public interface ComentarioProdutoWebService extends java.rmi.Remote {
    public void inserirComentarioProduto(java.util.Calendar data, java.lang.String titulo, java.lang.String assunto, java.lang.String comentario, java.lang.Integer avaliacao) throws java.rmi.RemoteException;
    public br.com.fiap.ws.ComentarioProduto[] listarComentariosProdutos() throws java.rmi.RemoteException;
}

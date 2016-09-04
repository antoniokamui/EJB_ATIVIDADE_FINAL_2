package br.com.fiap.ws;

public class ComentarioProdutoWebServiceProxy implements br.com.fiap.ws.ComentarioProdutoWebService {
  private String _endpoint = null;
  private br.com.fiap.ws.ComentarioProdutoWebService comentarioProdutoWebService = null;
  
  public ComentarioProdutoWebServiceProxy() {
    _initComentarioProdutoWebServiceProxy();
  }
  
  public ComentarioProdutoWebServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initComentarioProdutoWebServiceProxy();
  }
  
  private void _initComentarioProdutoWebServiceProxy() {
    try {
      comentarioProdutoWebService = (new br.com.fiap.ws.ComentarioProdutoWebServiceComentarioprodutooendpointLocator()).getComentarioProdutoWebServiceImplPort();
      if (comentarioProdutoWebService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)comentarioProdutoWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)comentarioProdutoWebService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (comentarioProdutoWebService != null)
      ((javax.xml.rpc.Stub)comentarioProdutoWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.fiap.ws.ComentarioProdutoWebService getComentarioProdutoWebService() {
    if (comentarioProdutoWebService == null)
      _initComentarioProdutoWebServiceProxy();
    return comentarioProdutoWebService;
  }
  
  public void inserirComentarioProduto(java.util.Calendar data, java.lang.String titulo, java.lang.String assunto, java.lang.String comentario, java.lang.Integer avaliacao) throws java.rmi.RemoteException{
    if (comentarioProdutoWebService == null)
      _initComentarioProdutoWebServiceProxy();
    comentarioProdutoWebService.inserirComentarioProduto(data, titulo, assunto, comentario, avaliacao);
  }
  
  public br.com.fiap.ws.ComentarioProduto[] listarComentariosProdutos() throws java.rmi.RemoteException{
    if (comentarioProdutoWebService == null)
      _initComentarioProdutoWebServiceProxy();
    return comentarioProdutoWebService.listarComentariosProdutos();
  }
  
  
}
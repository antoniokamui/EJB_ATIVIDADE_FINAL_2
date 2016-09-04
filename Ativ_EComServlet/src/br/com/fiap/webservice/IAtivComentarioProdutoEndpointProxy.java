package br.com.fiap.webservice;

public class IAtivComentarioProdutoEndpointProxy implements br.com.fiap.webservice.IAtivComentarioProdutoEndpoint {
  private String _endpoint = null;
  private br.com.fiap.webservice.IAtivComentarioProdutoEndpoint iAtivComentarioProdutoEndpoint = null;
  
  public IAtivComentarioProdutoEndpointProxy() {
    _initIAtivComentarioProdutoEndpointProxy();
  }
  
  public IAtivComentarioProdutoEndpointProxy(String endpoint) {
    _endpoint = endpoint;
    _initIAtivComentarioProdutoEndpointProxy();
  }
  
  private void _initIAtivComentarioProdutoEndpointProxy() {
    try {
      iAtivComentarioProdutoEndpoint = (new br.com.fiap.webservice.AtivComentarioProdutoEndpointLocator()).getAtivComentarioProdutoEndpointPort();
      if (iAtivComentarioProdutoEndpoint != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iAtivComentarioProdutoEndpoint)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iAtivComentarioProdutoEndpoint)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iAtivComentarioProdutoEndpoint != null)
      ((javax.xml.rpc.Stub)iAtivComentarioProdutoEndpoint)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.fiap.webservice.IAtivComentarioProdutoEndpoint getIAtivComentarioProdutoEndpoint() {
    if (iAtivComentarioProdutoEndpoint == null)
      _initIAtivComentarioProdutoEndpointProxy();
    return iAtivComentarioProdutoEndpoint;
  }
  
  public br.com.fiap.webservice.ComentarioProduto[] listarComentariosProduto() throws java.rmi.RemoteException{
    if (iAtivComentarioProdutoEndpoint == null)
      _initIAtivComentarioProdutoEndpointProxy();
    return iAtivComentarioProdutoEndpoint.listarComentariosProduto();
  }
  
  public void inserirComentarioProduto(br.com.fiap.webservice.ComentarioProduto arg0) throws java.rmi.RemoteException{
    if (iAtivComentarioProdutoEndpoint == null)
      _initIAtivComentarioProdutoEndpointProxy();
    iAtivComentarioProdutoEndpoint.inserirComentarioProduto(arg0);
  }
  
  
}
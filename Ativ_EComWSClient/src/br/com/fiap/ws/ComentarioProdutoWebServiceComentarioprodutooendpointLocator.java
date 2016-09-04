/**
 * ComentarioProdutoWebServiceComentarioprodutooendpointLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.fiap.ws;

public class ComentarioProdutoWebServiceComentarioprodutooendpointLocator extends org.apache.axis.client.Service implements br.com.fiap.ws.ComentarioProdutoWebServiceComentarioprodutooendpoint {

    public ComentarioProdutoWebServiceComentarioprodutooendpointLocator() {
    }


    public ComentarioProdutoWebServiceComentarioprodutooendpointLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ComentarioProdutoWebServiceComentarioprodutooendpointLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ComentarioProdutoWebServiceImplPort
    private java.lang.String ComentarioProdutoWebServiceImplPort_address = "http://localhost:8080/Ativ_EComWS/ComentarioProdutoWebService/comentarioprodutooendpoint";

    public java.lang.String getComentarioProdutoWebServiceImplPortAddress() {
        return ComentarioProdutoWebServiceImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ComentarioProdutoWebServiceImplPortWSDDServiceName = "ComentarioProdutoWebServiceImplPort";

    public java.lang.String getComentarioProdutoWebServiceImplPortWSDDServiceName() {
        return ComentarioProdutoWebServiceImplPortWSDDServiceName;
    }

    public void setComentarioProdutoWebServiceImplPortWSDDServiceName(java.lang.String name) {
        ComentarioProdutoWebServiceImplPortWSDDServiceName = name;
    }

    public br.com.fiap.ws.ComentarioProdutoWebService getComentarioProdutoWebServiceImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ComentarioProdutoWebServiceImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getComentarioProdutoWebServiceImplPort(endpoint);
    }

    public br.com.fiap.ws.ComentarioProdutoWebService getComentarioProdutoWebServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.fiap.ws.ComentarioProdutoWebServiceComentarioprodutooendpointSoapBindingStub _stub = new br.com.fiap.ws.ComentarioProdutoWebServiceComentarioprodutooendpointSoapBindingStub(portAddress, this);
            _stub.setPortName(getComentarioProdutoWebServiceImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setComentarioProdutoWebServiceImplPortEndpointAddress(java.lang.String address) {
        ComentarioProdutoWebServiceImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.fiap.ws.ComentarioProdutoWebService.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.fiap.ws.ComentarioProdutoWebServiceComentarioprodutooendpointSoapBindingStub _stub = new br.com.fiap.ws.ComentarioProdutoWebServiceComentarioprodutooendpointSoapBindingStub(new java.net.URL(ComentarioProdutoWebServiceImplPort_address), this);
                _stub.setPortName(getComentarioProdutoWebServiceImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ComentarioProdutoWebServiceImplPort".equals(inputPortName)) {
            return getComentarioProdutoWebServiceImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.fiap.com.br/", "ComentarioProdutoWebService/comentarioprodutooendpoint");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.fiap.com.br/", "ComentarioProdutoWebServiceImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ComentarioProdutoWebServiceImplPort".equals(portName)) {
            setComentarioProdutoWebServiceImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}

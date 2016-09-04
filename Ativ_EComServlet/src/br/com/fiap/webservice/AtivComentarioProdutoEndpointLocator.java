/**
 * AtivComentarioProdutoEndpointLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.fiap.webservice;

public class AtivComentarioProdutoEndpointLocator extends org.apache.axis.client.Service implements br.com.fiap.webservice.AtivComentarioProdutoEndpoint {

    public AtivComentarioProdutoEndpointLocator() {
    }


    public AtivComentarioProdutoEndpointLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AtivComentarioProdutoEndpointLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AtivComentarioProdutoEndpointPort
    private java.lang.String AtivComentarioProdutoEndpointPort_address = "http://localhost:8080/Ativ_EComJSF/AtivComentarioProdutoEndpoint";

    public java.lang.String getAtivComentarioProdutoEndpointPortAddress() {
        return AtivComentarioProdutoEndpointPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AtivComentarioProdutoEndpointPortWSDDServiceName = "AtivComentarioProdutoEndpointPort";

    public java.lang.String getAtivComentarioProdutoEndpointPortWSDDServiceName() {
        return AtivComentarioProdutoEndpointPortWSDDServiceName;
    }

    public void setAtivComentarioProdutoEndpointPortWSDDServiceName(java.lang.String name) {
        AtivComentarioProdutoEndpointPortWSDDServiceName = name;
    }

    public br.com.fiap.webservice.IAtivComentarioProdutoEndpoint getAtivComentarioProdutoEndpointPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AtivComentarioProdutoEndpointPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAtivComentarioProdutoEndpointPort(endpoint);
    }

    public br.com.fiap.webservice.IAtivComentarioProdutoEndpoint getAtivComentarioProdutoEndpointPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.fiap.webservice.AtivComentarioProdutoEndpointSoapBindingStub _stub = new br.com.fiap.webservice.AtivComentarioProdutoEndpointSoapBindingStub(portAddress, this);
            _stub.setPortName(getAtivComentarioProdutoEndpointPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAtivComentarioProdutoEndpointPortEndpointAddress(java.lang.String address) {
        AtivComentarioProdutoEndpointPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.fiap.webservice.IAtivComentarioProdutoEndpoint.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.fiap.webservice.AtivComentarioProdutoEndpointSoapBindingStub _stub = new br.com.fiap.webservice.AtivComentarioProdutoEndpointSoapBindingStub(new java.net.URL(AtivComentarioProdutoEndpointPort_address), this);
                _stub.setPortName(getAtivComentarioProdutoEndpointPortWSDDServiceName());
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
        if ("AtivComentarioProdutoEndpointPort".equals(inputPortName)) {
            return getAtivComentarioProdutoEndpointPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservice.fiap.com.br/", "AtivComentarioProdutoEndpoint");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservice.fiap.com.br/", "AtivComentarioProdutoEndpointPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AtivComentarioProdutoEndpointPort".equals(portName)) {
            setAtivComentarioProdutoEndpointPortEndpointAddress(address);
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

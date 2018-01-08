/**
 * CatalogueServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.ynov.biblioskill.service;

public class CatalogueServiceServiceLocator extends org.apache.axis.client.Service implements fr.ynov.biblioskill.service.CatalogueServiceService {

    public CatalogueServiceServiceLocator() {
    }


    public CatalogueServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CatalogueServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for cataloguePort
    private java.lang.String cataloguePort_address = "http://localhost:4269/";

    public java.lang.String getcataloguePortAddress() {
        return cataloguePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String cataloguePortWSDDServiceName = "cataloguePort";

    public java.lang.String getcataloguePortWSDDServiceName() {
        return cataloguePortWSDDServiceName;
    }

    public void setcataloguePortWSDDServiceName(java.lang.String name) {
        cataloguePortWSDDServiceName = name;
    }

    public fr.ynov.biblioskill.service.Catalogue getcataloguePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(cataloguePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getcataloguePort(endpoint);
    }

    public fr.ynov.biblioskill.service.Catalogue getcataloguePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            fr.ynov.biblioskill.service.CataloguePortBindingStub _stub = new fr.ynov.biblioskill.service.CataloguePortBindingStub(portAddress, this);
            _stub.setPortName(getcataloguePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setcataloguePortEndpointAddress(java.lang.String address) {
        cataloguePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (fr.ynov.biblioskill.service.Catalogue.class.isAssignableFrom(serviceEndpointInterface)) {
                fr.ynov.biblioskill.service.CataloguePortBindingStub _stub = new fr.ynov.biblioskill.service.CataloguePortBindingStub(new java.net.URL(cataloguePort_address), this);
                _stub.setPortName(getcataloguePortWSDDServiceName());
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
        if ("cataloguePort".equals(inputPortName)) {
            return getcataloguePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.biblioskill.ynov.fr/", "CatalogueServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.biblioskill.ynov.fr/", "cataloguePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("cataloguePort".equals(portName)) {
            setcataloguePortEndpointAddress(address);
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

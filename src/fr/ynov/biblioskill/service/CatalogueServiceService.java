/**
 * CatalogueServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.ynov.biblioskill.service;

public interface CatalogueServiceService extends javax.xml.rpc.Service {
    public java.lang.String getcataloguePortAddress();

    public fr.ynov.biblioskill.service.Catalogue getcataloguePort() throws javax.xml.rpc.ServiceException;

    public fr.ynov.biblioskill.service.Catalogue getcataloguePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}

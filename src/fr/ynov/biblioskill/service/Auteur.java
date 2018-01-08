/**
 * Auteur.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.ynov.biblioskill.service;

public class Auteur  implements java.io.Serializable {
    private java.lang.Long id;

    private java.lang.String nationalite;

    private fr.ynov.biblioskill.service.TypeAuteur type;

    private java.lang.String aProposDe;

    public Auteur() {
    }

    public Auteur(
           java.lang.Long id,
           java.lang.String nationalite,
           fr.ynov.biblioskill.service.TypeAuteur type,
           java.lang.String aProposDe) {
           this.id = id;
           this.nationalite = nationalite;
           this.type = type;
           this.aProposDe = aProposDe;
    }


    /**
     * Gets the id value for this Auteur.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this Auteur.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the nationalite value for this Auteur.
     * 
     * @return nationalite
     */
    public java.lang.String getNationalite() {
        return nationalite;
    }


    /**
     * Sets the nationalite value for this Auteur.
     * 
     * @param nationalite
     */
    public void setNationalite(java.lang.String nationalite) {
        this.nationalite = nationalite;
    }


    /**
     * Gets the type value for this Auteur.
     * 
     * @return type
     */
    public fr.ynov.biblioskill.service.TypeAuteur getType() {
        return type;
    }


    /**
     * Sets the type value for this Auteur.
     * 
     * @param type
     */
    public void setType(fr.ynov.biblioskill.service.TypeAuteur type) {
        this.type = type;
    }


    /**
     * Gets the aProposDe value for this Auteur.
     * 
     * @return aProposDe
     */
    public java.lang.String getAProposDe() {
        return aProposDe;
    }


    /**
     * Sets the aProposDe value for this Auteur.
     * 
     * @param aProposDe
     */
    public void setAProposDe(java.lang.String aProposDe) {
        this.aProposDe = aProposDe;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Auteur)) return false;
        Auteur other = (Auteur) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.nationalite==null && other.getNationalite()==null) || 
             (this.nationalite!=null &&
              this.nationalite.equals(other.getNationalite()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.aProposDe==null && other.getAProposDe()==null) || 
             (this.aProposDe!=null &&
              this.aProposDe.equals(other.getAProposDe())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getNationalite() != null) {
            _hashCode += getNationalite().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getAProposDe() != null) {
            _hashCode += getAProposDe().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Auteur.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.biblioskill.ynov.fr/", "auteur"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nationalite");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nationalite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.biblioskill.ynov.fr/", "typeAuteur"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AProposDe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aProposDe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

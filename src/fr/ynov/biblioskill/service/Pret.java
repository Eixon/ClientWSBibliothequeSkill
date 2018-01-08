/**
 * Pret.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.ynov.biblioskill.service;

public class Pret  implements java.io.Serializable {
    private java.util.Calendar dateDebut;

    private int duree;

    private java.lang.Long id;

    public Pret() {
    }

    public Pret(
           java.util.Calendar dateDebut,
           int duree,
           java.lang.Long id) {
           this.dateDebut = dateDebut;
           this.duree = duree;
           this.id = id;
    }


    /**
     * Gets the dateDebut value for this Pret.
     * 
     * @return dateDebut
     */
    public java.util.Calendar getDateDebut() {
        return dateDebut;
    }


    /**
     * Sets the dateDebut value for this Pret.
     * 
     * @param dateDebut
     */
    public void setDateDebut(java.util.Calendar dateDebut) {
        this.dateDebut = dateDebut;
    }


    /**
     * Gets the duree value for this Pret.
     * 
     * @return duree
     */
    public int getDuree() {
        return duree;
    }


    /**
     * Sets the duree value for this Pret.
     * 
     * @param duree
     */
    public void setDuree(int duree) {
        this.duree = duree;
    }


    /**
     * Gets the id value for this Pret.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this Pret.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Pret)) return false;
        Pret other = (Pret) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dateDebut==null && other.getDateDebut()==null) || 
             (this.dateDebut!=null &&
              this.dateDebut.equals(other.getDateDebut()))) &&
            this.duree == other.getDuree() &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId())));
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
        if (getDateDebut() != null) {
            _hashCode += getDateDebut().hashCode();
        }
        _hashCode += getDuree();
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Pret.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.biblioskill.ynov.fr/", "pret"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateDebut");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateDebut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duree");
        elemField.setXmlName(new javax.xml.namespace.QName("", "duree"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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

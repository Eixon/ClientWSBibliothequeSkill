/**
 * Personne.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.ynov.biblioskill.service;

public class Personne  implements java.io.Serializable {
    private java.util.Calendar dateDeNaissance;

    private java.lang.String email;

    private java.lang.Long id;

    private java.lang.String nom;

    private java.lang.String photo;

    private java.lang.String prenom;

    private java.lang.String sexe;

    public Personne() {
    }

    public Personne(
           java.util.Calendar dateDeNaissance,
           java.lang.String email,
           java.lang.Long id,
           java.lang.String nom,
           java.lang.String photo,
           java.lang.String prenom,
           java.lang.String sexe) {
           this.dateDeNaissance = dateDeNaissance;
           this.email = email;
           this.id = id;
           this.nom = nom;
           this.photo = photo;
           this.prenom = prenom;
           this.sexe = sexe;
    }


    /**
     * Gets the dateDeNaissance value for this Personne.
     * 
     * @return dateDeNaissance
     */
    public java.util.Calendar getDateDeNaissance() {
        return dateDeNaissance;
    }


    /**
     * Sets the dateDeNaissance value for this Personne.
     * 
     * @param dateDeNaissance
     */
    public void setDateDeNaissance(java.util.Calendar dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }


    /**
     * Gets the email value for this Personne.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Personne.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the id value for this Personne.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this Personne.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the nom value for this Personne.
     * 
     * @return nom
     */
    public java.lang.String getNom() {
        return nom;
    }


    /**
     * Sets the nom value for this Personne.
     * 
     * @param nom
     */
    public void setNom(java.lang.String nom) {
        this.nom = nom;
    }


    /**
     * Gets the photo value for this Personne.
     * 
     * @return photo
     */
    public java.lang.String getPhoto() {
        return photo;
    }


    /**
     * Sets the photo value for this Personne.
     * 
     * @param photo
     */
    public void setPhoto(java.lang.String photo) {
        this.photo = photo;
    }


    /**
     * Gets the prenom value for this Personne.
     * 
     * @return prenom
     */
    public java.lang.String getPrenom() {
        return prenom;
    }


    /**
     * Sets the prenom value for this Personne.
     * 
     * @param prenom
     */
    public void setPrenom(java.lang.String prenom) {
        this.prenom = prenom;
    }


    /**
     * Gets the sexe value for this Personne.
     * 
     * @return sexe
     */
    public java.lang.String getSexe() {
        return sexe;
    }


    /**
     * Sets the sexe value for this Personne.
     * 
     * @param sexe
     */
    public void setSexe(java.lang.String sexe) {
        this.sexe = sexe;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Personne)) return false;
        Personne other = (Personne) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dateDeNaissance==null && other.getDateDeNaissance()==null) || 
             (this.dateDeNaissance!=null &&
              this.dateDeNaissance.equals(other.getDateDeNaissance()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.nom==null && other.getNom()==null) || 
             (this.nom!=null &&
              this.nom.equals(other.getNom()))) &&
            ((this.photo==null && other.getPhoto()==null) || 
             (this.photo!=null &&
              this.photo.equals(other.getPhoto()))) &&
            ((this.prenom==null && other.getPrenom()==null) || 
             (this.prenom!=null &&
              this.prenom.equals(other.getPrenom()))) &&
            ((this.sexe==null && other.getSexe()==null) || 
             (this.sexe!=null &&
              this.sexe.equals(other.getSexe())));
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
        if (getDateDeNaissance() != null) {
            _hashCode += getDateDeNaissance().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getNom() != null) {
            _hashCode += getNom().hashCode();
        }
        if (getPhoto() != null) {
            _hashCode += getPhoto().hashCode();
        }
        if (getPrenom() != null) {
            _hashCode += getPrenom().hashCode();
        }
        if (getSexe() != null) {
            _hashCode += getSexe().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Personne.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.biblioskill.ynov.fr/", "personne"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateDeNaissance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateDeNaissance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("photo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "photo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prenom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prenom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sexe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sexe"));
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

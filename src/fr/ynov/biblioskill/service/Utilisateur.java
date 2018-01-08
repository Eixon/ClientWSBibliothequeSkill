/**
 * Utilisateur.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.ynov.biblioskill.service;

public class Utilisateur  implements java.io.Serializable {
    private java.util.Calendar derniereConnexion;

    private java.lang.Long id;

    private java.lang.String motDePasse;

    private java.lang.String nomUtilisateur;

    private fr.ynov.biblioskill.service.AccountType statutCompte;

    public Utilisateur() {
    }

    public Utilisateur(
           java.util.Calendar derniereConnexion,
           java.lang.Long id,
           java.lang.String motDePasse,
           java.lang.String nomUtilisateur,
           fr.ynov.biblioskill.service.AccountType statutCompte) {
           this.derniereConnexion = derniereConnexion;
           this.id = id;
           this.motDePasse = motDePasse;
           this.nomUtilisateur = nomUtilisateur;
           this.statutCompte = statutCompte;
    }


    /**
     * Gets the derniereConnexion value for this Utilisateur.
     * 
     * @return derniereConnexion
     */
    public java.util.Calendar getDerniereConnexion() {
        return derniereConnexion;
    }


    /**
     * Sets the derniereConnexion value for this Utilisateur.
     * 
     * @param derniereConnexion
     */
    public void setDerniereConnexion(java.util.Calendar derniereConnexion) {
        this.derniereConnexion = derniereConnexion;
    }


    /**
     * Gets the id value for this Utilisateur.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this Utilisateur.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the motDePasse value for this Utilisateur.
     * 
     * @return motDePasse
     */
    public java.lang.String getMotDePasse() {
        return motDePasse;
    }


    /**
     * Sets the motDePasse value for this Utilisateur.
     * 
     * @param motDePasse
     */
    public void setMotDePasse(java.lang.String motDePasse) {
        this.motDePasse = motDePasse;
    }


    /**
     * Gets the nomUtilisateur value for this Utilisateur.
     * 
     * @return nomUtilisateur
     */
    public java.lang.String getNomUtilisateur() {
        return nomUtilisateur;
    }


    /**
     * Sets the nomUtilisateur value for this Utilisateur.
     * 
     * @param nomUtilisateur
     */
    public void setNomUtilisateur(java.lang.String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }


    /**
     * Gets the statutCompte value for this Utilisateur.
     * 
     * @return statutCompte
     */
    public fr.ynov.biblioskill.service.AccountType getStatutCompte() {
        return statutCompte;
    }


    /**
     * Sets the statutCompte value for this Utilisateur.
     * 
     * @param statutCompte
     */
    public void setStatutCompte(fr.ynov.biblioskill.service.AccountType statutCompte) {
        this.statutCompte = statutCompte;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Utilisateur)) return false;
        Utilisateur other = (Utilisateur) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.derniereConnexion==null && other.getDerniereConnexion()==null) || 
             (this.derniereConnexion!=null &&
              this.derniereConnexion.equals(other.getDerniereConnexion()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.motDePasse==null && other.getMotDePasse()==null) || 
             (this.motDePasse!=null &&
              this.motDePasse.equals(other.getMotDePasse()))) &&
            ((this.nomUtilisateur==null && other.getNomUtilisateur()==null) || 
             (this.nomUtilisateur!=null &&
              this.nomUtilisateur.equals(other.getNomUtilisateur()))) &&
            ((this.statutCompte==null && other.getStatutCompte()==null) || 
             (this.statutCompte!=null &&
              this.statutCompte.equals(other.getStatutCompte())));
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
        if (getDerniereConnexion() != null) {
            _hashCode += getDerniereConnexion().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getMotDePasse() != null) {
            _hashCode += getMotDePasse().hashCode();
        }
        if (getNomUtilisateur() != null) {
            _hashCode += getNomUtilisateur().hashCode();
        }
        if (getStatutCompte() != null) {
            _hashCode += getStatutCompte().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Utilisateur.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.biblioskill.ynov.fr/", "utilisateur"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("derniereConnexion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "derniereConnexion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("motDePasse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "motDePasse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomUtilisateur");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomUtilisateur"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statutCompte");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statutCompte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.biblioskill.ynov.fr/", "accountType"));
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

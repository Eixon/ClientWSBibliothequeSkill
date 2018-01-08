/**
 * Livre.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.ynov.biblioskill.service;

public class Livre  implements java.io.Serializable {
    private fr.ynov.biblioskill.service.Auteur auteur;

    private fr.ynov.biblioskill.service.Categorie categorie;

    private java.util.Calendar datePublication;

    private java.lang.Long id;

    private java.lang.String isbn;

    private java.lang.String photo;

    private int quantite;

    private java.lang.String resume;

    private java.lang.String titre;

    public Livre() {
    }

    public Livre(
           fr.ynov.biblioskill.service.Auteur auteur,
           fr.ynov.biblioskill.service.Categorie categorie,
           java.util.Calendar datePublication,
           java.lang.Long id,
           java.lang.String isbn,
           java.lang.String photo,
           int quantite,
           java.lang.String resume,
           java.lang.String titre) {
           this.auteur = auteur;
           this.categorie = categorie;
           this.datePublication = datePublication;
           this.id = id;
           this.isbn = isbn;
           this.photo = photo;
           this.quantite = quantite;
           this.resume = resume;
           this.titre = titre;
    }


    /**
     * Gets the auteur value for this Livre.
     * 
     * @return auteur
     */
    public fr.ynov.biblioskill.service.Auteur getAuteur() {
        return auteur;
    }


    /**
     * Sets the auteur value for this Livre.
     * 
     * @param auteur
     */
    public void setAuteur(fr.ynov.biblioskill.service.Auteur auteur) {
        this.auteur = auteur;
    }


    /**
     * Gets the categorie value for this Livre.
     * 
     * @return categorie
     */
    public fr.ynov.biblioskill.service.Categorie getCategorie() {
        return categorie;
    }


    /**
     * Sets the categorie value for this Livre.
     * 
     * @param categorie
     */
    public void setCategorie(fr.ynov.biblioskill.service.Categorie categorie) {
        this.categorie = categorie;
    }


    /**
     * Gets the datePublication value for this Livre.
     * 
     * @return datePublication
     */
    public java.util.Calendar getDatePublication() {
        return datePublication;
    }


    /**
     * Sets the datePublication value for this Livre.
     * 
     * @param datePublication
     */
    public void setDatePublication(java.util.Calendar datePublication) {
        this.datePublication = datePublication;
    }


    /**
     * Gets the id value for this Livre.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this Livre.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the isbn value for this Livre.
     * 
     * @return isbn
     */
    public java.lang.String getIsbn() {
        return isbn;
    }


    /**
     * Sets the isbn value for this Livre.
     * 
     * @param isbn
     */
    public void setIsbn(java.lang.String isbn) {
        this.isbn = isbn;
    }


    /**
     * Gets the photo value for this Livre.
     * 
     * @return photo
     */
    public java.lang.String getPhoto() {
        return photo;
    }


    /**
     * Sets the photo value for this Livre.
     * 
     * @param photo
     */
    public void setPhoto(java.lang.String photo) {
        this.photo = photo;
    }


    /**
     * Gets the quantite value for this Livre.
     * 
     * @return quantite
     */
    public int getQuantite() {
        return quantite;
    }


    /**
     * Sets the quantite value for this Livre.
     * 
     * @param quantite
     */
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }


    /**
     * Gets the resume value for this Livre.
     * 
     * @return resume
     */
    public java.lang.String getResume() {
        return resume;
    }


    /**
     * Sets the resume value for this Livre.
     * 
     * @param resume
     */
    public void setResume(java.lang.String resume) {
        this.resume = resume;
    }


    /**
     * Gets the titre value for this Livre.
     * 
     * @return titre
     */
    public java.lang.String getTitre() {
        return titre;
    }


    /**
     * Sets the titre value for this Livre.
     * 
     * @param titre
     */
    public void setTitre(java.lang.String titre) {
        this.titre = titre;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Livre)) return false;
        Livre other = (Livre) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.auteur==null && other.getAuteur()==null) || 
             (this.auteur!=null &&
              this.auteur.equals(other.getAuteur()))) &&
            ((this.categorie==null && other.getCategorie()==null) || 
             (this.categorie!=null &&
              this.categorie.equals(other.getCategorie()))) &&
            ((this.datePublication==null && other.getDatePublication()==null) || 
             (this.datePublication!=null &&
              this.datePublication.equals(other.getDatePublication()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.isbn==null && other.getIsbn()==null) || 
             (this.isbn!=null &&
              this.isbn.equals(other.getIsbn()))) &&
            ((this.photo==null && other.getPhoto()==null) || 
             (this.photo!=null &&
              this.photo.equals(other.getPhoto()))) &&
            this.quantite == other.getQuantite() &&
            ((this.resume==null && other.getResume()==null) || 
             (this.resume!=null &&
              this.resume.equals(other.getResume()))) &&
            ((this.titre==null && other.getTitre()==null) || 
             (this.titre!=null &&
              this.titre.equals(other.getTitre())));
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
        if (getAuteur() != null) {
            _hashCode += getAuteur().hashCode();
        }
        if (getCategorie() != null) {
            _hashCode += getCategorie().hashCode();
        }
        if (getDatePublication() != null) {
            _hashCode += getDatePublication().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getIsbn() != null) {
            _hashCode += getIsbn().hashCode();
        }
        if (getPhoto() != null) {
            _hashCode += getPhoto().hashCode();
        }
        _hashCode += getQuantite();
        if (getResume() != null) {
            _hashCode += getResume().hashCode();
        }
        if (getTitre() != null) {
            _hashCode += getTitre().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Livre.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.biblioskill.ynov.fr/", "livre"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auteur");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auteur"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.biblioskill.ynov.fr/", "auteur"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categorie");
        elemField.setXmlName(new javax.xml.namespace.QName("", "categorie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.biblioskill.ynov.fr/", "categorie"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datePublication");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datePublication"));
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
        elemField.setFieldName("isbn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isbn"));
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
        elemField.setFieldName("quantite");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resume");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "titre"));
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

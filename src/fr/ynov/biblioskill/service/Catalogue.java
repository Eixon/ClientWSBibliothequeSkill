/**
 * Catalogue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.ynov.biblioskill.service;

public interface Catalogue extends java.rmi.Remote {
    public fr.ynov.biblioskill.service.Personne updatePersonne(fr.ynov.biblioskill.service.Personne arg0) throws java.rmi.RemoteException;
    public fr.ynov.biblioskill.service.Auteur getAuteur(java.lang.Long arg0) throws java.rmi.RemoteException;
    public fr.ynov.biblioskill.service.Auteur[] consulterAuteurs() throws java.rmi.RemoteException;
    public fr.ynov.biblioskill.service.Auteur updateAuteur(fr.ynov.biblioskill.service.Auteur arg0) throws java.rmi.RemoteException;
    public fr.ynov.biblioskill.service.Categorie updateCategorie(fr.ynov.biblioskill.service.Categorie arg0) throws java.rmi.RemoteException;
    public fr.ynov.biblioskill.service.Categorie getCategorie(java.lang.Long arg0) throws java.rmi.RemoteException;
    public boolean auteurs(java.lang.Long arg0) throws java.rmi.RemoteException;
    public fr.ynov.biblioskill.service.Livre saveLivre(fr.ynov.biblioskill.service.Livre arg0) throws java.rmi.RemoteException;
    public fr.ynov.biblioskill.service.Livre[] livresParMC(java.lang.Long arg0) throws java.rmi.RemoteException;
    public fr.ynov.biblioskill.service.Categorie saveCategorie(fr.ynov.biblioskill.service.Categorie arg0) throws java.rmi.RemoteException;
    public fr.ynov.biblioskill.service.Auteur saveAuteur(fr.ynov.biblioskill.service.Auteur arg0) throws java.rmi.RemoteException;
    public boolean categories(java.lang.Long arg0) throws java.rmi.RemoteException;
    public fr.ynov.biblioskill.service.Livre[] consulterLivres() throws java.rmi.RemoteException;
    public fr.ynov.biblioskill.service.Livre getLivre(java.lang.Long arg0) throws java.rmi.RemoteException;
    public fr.ynov.biblioskill.service.Livre[] livresParCat(java.lang.Long arg0) throws java.rmi.RemoteException;
    public fr.ynov.biblioskill.service.Livre updateLivre(fr.ynov.biblioskill.service.Livre arg0) throws java.rmi.RemoteException;
    public boolean deleteLivre(java.lang.Long arg0) throws java.rmi.RemoteException;
    public fr.ynov.biblioskill.service.Pret updatePret(fr.ynov.biblioskill.service.Pret arg0) throws java.rmi.RemoteException;
    public fr.ynov.biblioskill.service.Pret[] consulterPret() throws java.rmi.RemoteException;
    public fr.ynov.biblioskill.service.Pret getPret(java.lang.Long arg0) throws java.rmi.RemoteException;
    public fr.ynov.biblioskill.service.Utilisateur getUtilisateur(java.lang.Long arg0) throws java.rmi.RemoteException;
    public boolean personnes(java.lang.Long arg0) throws java.rmi.RemoteException;
    public fr.ynov.biblioskill.service.Personne getPersonne(java.lang.Long arg0) throws java.rmi.RemoteException;
    public boolean utilisateurs(java.lang.Long arg0) throws java.rmi.RemoteException;
    public boolean prets(java.lang.Long arg0) throws java.rmi.RemoteException;
    public fr.ynov.biblioskill.service.Utilisateur saveUtilisateur(fr.ynov.biblioskill.service.Utilisateur arg0) throws java.rmi.RemoteException;
    public fr.ynov.biblioskill.service.Pret savePret(fr.ynov.biblioskill.service.Pret arg0) throws java.rmi.RemoteException;
    public fr.ynov.biblioskill.service.Personne savePersonne(fr.ynov.biblioskill.service.Personne arg0) throws java.rmi.RemoteException;
    public fr.ynov.biblioskill.service.Utilisateur[] consulterUtilisateur() throws java.rmi.RemoteException;
    public fr.ynov.biblioskill.service.Personne[] consulterPersonnes() throws java.rmi.RemoteException;
    public fr.ynov.biblioskill.service.Utilisateur updateUtilisateur(fr.ynov.biblioskill.service.Utilisateur arg0) throws java.rmi.RemoteException;
    public fr.ynov.biblioskill.service.Categorie[] consulterCategories() throws java.rmi.RemoteException;
}

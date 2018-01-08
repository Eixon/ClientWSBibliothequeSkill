package fr.ynov.biblioskill.service;

public class CatalogueProxy implements fr.ynov.biblioskill.service.Catalogue {
  private String _endpoint = null;
  private fr.ynov.biblioskill.service.Catalogue catalogue = null;
  
  public CatalogueProxy() {
    _initCatalogueProxy();
  }
  
  public CatalogueProxy(String endpoint) {
    _endpoint = endpoint;
    _initCatalogueProxy();
  }
  
  private void _initCatalogueProxy() {
    try {
      catalogue = (new fr.ynov.biblioskill.service.CatalogueServiceServiceLocator()).getcataloguePort();
      if (catalogue != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)catalogue)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)catalogue)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (catalogue != null)
      ((javax.xml.rpc.Stub)catalogue)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public fr.ynov.biblioskill.service.Catalogue getCatalogue() {
    if (catalogue == null)
      _initCatalogueProxy();
    return catalogue;
  }
  
  public fr.ynov.biblioskill.service.Personne updatePersonne(fr.ynov.biblioskill.service.Personne arg0) throws java.rmi.RemoteException{
    if (catalogue == null)
      _initCatalogueProxy();
    return catalogue.updatePersonne(arg0);
  }
  
  public fr.ynov.biblioskill.service.Auteur getAuteur(java.lang.Long arg0) throws java.rmi.RemoteException{
    if (catalogue == null)
      _initCatalogueProxy();
    return catalogue.getAuteur(arg0);
  }
  
  public fr.ynov.biblioskill.service.Auteur[] consulterAuteurs() throws java.rmi.RemoteException{
    if (catalogue == null)
      _initCatalogueProxy();
    return catalogue.consulterAuteurs();
  }
  
  public fr.ynov.biblioskill.service.Auteur updateAuteur(fr.ynov.biblioskill.service.Auteur arg0) throws java.rmi.RemoteException{
    if (catalogue == null)
      _initCatalogueProxy();
    return catalogue.updateAuteur(arg0);
  }
  
  public fr.ynov.biblioskill.service.Categorie updateCategorie(fr.ynov.biblioskill.service.Categorie arg0) throws java.rmi.RemoteException{
    if (catalogue == null)
      _initCatalogueProxy();
    return catalogue.updateCategorie(arg0);
  }
  
  public fr.ynov.biblioskill.service.Categorie getCategorie(java.lang.Long arg0) throws java.rmi.RemoteException{
    if (catalogue == null)
      _initCatalogueProxy();
    return catalogue.getCategorie(arg0);
  }
  
  public boolean auteurs(java.lang.Long arg0) throws java.rmi.RemoteException{
    if (catalogue == null)
      _initCatalogueProxy();
    return catalogue.auteurs(arg0);
  }
  
  public fr.ynov.biblioskill.service.Livre saveLivre(fr.ynov.biblioskill.service.Livre arg0) throws java.rmi.RemoteException{
    if (catalogue == null)
      _initCatalogueProxy();
    return catalogue.saveLivre(arg0);
  }
  
  public fr.ynov.biblioskill.service.Livre[] livresParMC(java.lang.Long arg0) throws java.rmi.RemoteException{
    if (catalogue == null)
      _initCatalogueProxy();
    return catalogue.livresParMC(arg0);
  }
  
  public fr.ynov.biblioskill.service.Categorie saveCategorie(fr.ynov.biblioskill.service.Categorie arg0) throws java.rmi.RemoteException{
    if (catalogue == null)
      _initCatalogueProxy();
    return catalogue.saveCategorie(arg0);
  }
  
  public fr.ynov.biblioskill.service.Auteur saveAuteur(fr.ynov.biblioskill.service.Auteur arg0) throws java.rmi.RemoteException{
    if (catalogue == null)
      _initCatalogueProxy();
    return catalogue.saveAuteur(arg0);
  }
  
  public boolean categories(java.lang.Long arg0) throws java.rmi.RemoteException{
    if (catalogue == null)
      _initCatalogueProxy();
    return catalogue.categories(arg0);
  }
  
  public fr.ynov.biblioskill.service.Livre[] consulterLivres() throws java.rmi.RemoteException{
    if (catalogue == null)
      _initCatalogueProxy();
    return catalogue.consulterLivres();
  }
  
  public fr.ynov.biblioskill.service.Livre getLivre(java.lang.Long arg0) throws java.rmi.RemoteException{
    if (catalogue == null)
      _initCatalogueProxy();
    return catalogue.getLivre(arg0);
  }
  
  public fr.ynov.biblioskill.service.Livre[] livresParCat(java.lang.Long arg0) throws java.rmi.RemoteException{
    if (catalogue == null)
      _initCatalogueProxy();
    return catalogue.livresParCat(arg0);
  }
  
  public fr.ynov.biblioskill.service.Livre updateLivre(fr.ynov.biblioskill.service.Livre arg0) throws java.rmi.RemoteException{
    if (catalogue == null)
      _initCatalogueProxy();
    return catalogue.updateLivre(arg0);
  }
  
  public boolean deleteLivre(java.lang.Long arg0) throws java.rmi.RemoteException{
    if (catalogue == null)
      _initCatalogueProxy();
    return catalogue.deleteLivre(arg0);
  }
  
  public fr.ynov.biblioskill.service.Pret updatePret(fr.ynov.biblioskill.service.Pret arg0) throws java.rmi.RemoteException{
    if (catalogue == null)
      _initCatalogueProxy();
    return catalogue.updatePret(arg0);
  }
  
  public fr.ynov.biblioskill.service.Pret[] consulterPret() throws java.rmi.RemoteException{
    if (catalogue == null)
      _initCatalogueProxy();
    return catalogue.consulterPret();
  }
  
  public fr.ynov.biblioskill.service.Pret getPret(java.lang.Long arg0) throws java.rmi.RemoteException{
    if (catalogue == null)
      _initCatalogueProxy();
    return catalogue.getPret(arg0);
  }
  
  public fr.ynov.biblioskill.service.Utilisateur getUtilisateur(java.lang.Long arg0) throws java.rmi.RemoteException{
    if (catalogue == null)
      _initCatalogueProxy();
    return catalogue.getUtilisateur(arg0);
  }
  
  public boolean personnes(java.lang.Long arg0) throws java.rmi.RemoteException{
    if (catalogue == null)
      _initCatalogueProxy();
    return catalogue.personnes(arg0);
  }
  
  public fr.ynov.biblioskill.service.Personne getPersonne(java.lang.Long arg0) throws java.rmi.RemoteException{
    if (catalogue == null)
      _initCatalogueProxy();
    return catalogue.getPersonne(arg0);
  }
  
  public boolean utilisateurs(java.lang.Long arg0) throws java.rmi.RemoteException{
    if (catalogue == null)
      _initCatalogueProxy();
    return catalogue.utilisateurs(arg0);
  }
  
  public boolean prets(java.lang.Long arg0) throws java.rmi.RemoteException{
    if (catalogue == null)
      _initCatalogueProxy();
    return catalogue.prets(arg0);
  }
  
  public fr.ynov.biblioskill.service.Utilisateur saveUtilisateur(fr.ynov.biblioskill.service.Utilisateur arg0) throws java.rmi.RemoteException{
    if (catalogue == null)
      _initCatalogueProxy();
    return catalogue.saveUtilisateur(arg0);
  }
  
  public fr.ynov.biblioskill.service.Pret savePret(fr.ynov.biblioskill.service.Pret arg0) throws java.rmi.RemoteException{
    if (catalogue == null)
      _initCatalogueProxy();
    return catalogue.savePret(arg0);
  }
  
  public fr.ynov.biblioskill.service.Personne savePersonne(fr.ynov.biblioskill.service.Personne arg0) throws java.rmi.RemoteException{
    if (catalogue == null)
      _initCatalogueProxy();
    return catalogue.savePersonne(arg0);
  }
  
  public fr.ynov.biblioskill.service.Utilisateur[] consulterUtilisateur() throws java.rmi.RemoteException{
    if (catalogue == null)
      _initCatalogueProxy();
    return catalogue.consulterUtilisateur();
  }
  
  public fr.ynov.biblioskill.service.Personne[] consulterPersonnes() throws java.rmi.RemoteException{
    if (catalogue == null)
      _initCatalogueProxy();
    return catalogue.consulterPersonnes();
  }
  
  public fr.ynov.biblioskill.service.Utilisateur updateUtilisateur(fr.ynov.biblioskill.service.Utilisateur arg0) throws java.rmi.RemoteException{
    if (catalogue == null)
      _initCatalogueProxy();
    return catalogue.updateUtilisateur(arg0);
  }
  
  public fr.ynov.biblioskill.service.Categorie[] consulterCategories() throws java.rmi.RemoteException{
    if (catalogue == null)
      _initCatalogueProxy();
    return catalogue.consulterCategories();
  }
  
  
}
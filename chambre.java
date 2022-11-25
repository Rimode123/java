package hotel;

import java.util.List;

public  class chambre {
	  
	  // attributs
	  private int numChamb; 
	  private int numcatego; 
	  private int nbPerso; 

	 
	
	 // Pour accéder aux propriétés private d’une classe dans une autre classe,
	 //on utilise des accesseurs et des mutateurs
	  
	  
     //Les getters nous permet d’acceder au contenu des propriétés privé
	  
	 public int getNumChamb() {
			return numChamb;
		}


		public void setNumChamb(int numChamb) {
			this.numChamb = numChamb;
		}  
	  
	  public int getNumcatego() {
		return numcatego;
	}


	  //Les setters nous permettent de modifier
	  //les contenus des propriétés privés.

	public void setNumcatego(int numChamb) {
		this.numChamb = numChamb;
	}


	public int getNbPerso() {
		return nbPerso;
	}




	public void setNbPerso(int nbPerso) {
		this.nbPerso = nbPerso;
	}


	 // methodes 
	
	
	
	public chambre(int num, int cat, int nbp) { 
		   this.numChamb=num; 
		   this.numcatego=cat; 
		   this.nbPerso=nbp; 
		  }  
	
	public int NumeroChambre(){ 
		   return this.numChamb;} ; 
	  
	public int Categorie(){ 
		   return this.numcatego;} ; 

    public int NbPersonne(){ 
		   return this.nbPerso;} ;  

	public int AfficherPrix(int tabPrix[][]){ 
	   return ( tabPrix[nbPerso-1][numcatego-1] );} ; 

	public void AfficherDescript(String tabDescript[]){ 
	   System.out.println("La description de la chambre est: "+tabDescript[numcatego-1] ) ;}


	
	  
	  
	  
	}
	
	
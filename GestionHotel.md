# Mini projet "Gestion d'un hotel"


![héritage](https://www.tresfacile.net/wp-content/uploads/2018/12/avenir-Java-poo.png)

 
 
                                                Rim idrissi zouggari (CDA)


## Journal des étapes de l'application en java (2022)

## Table des matières

1. [1. Présentation de mini projet](#poo)
2. [2.les classes et un diagramme globale ](#base)
3. [3.Attributs & méthodes utiliser dans l'application](#att) 
4. [4.Principe d’encapsulation dans le code ](#enc)
5. [5.Association, composition et agrégation ](#Heri)
6. [6.la partie principale du programme ](#main)


### Semaine du 21/11

## Mini projet Gestion d'un hotel<a name="poo"></a>

 ## Un hôtel gère des chambres permettant de recevoir de une à quatre personnes et classifiées selon 6 catégories. 

   - On dispose de deux tableaux TabPrix et TabDescript pour réaliser notre application 
## TabPrix
![héritage](http://isabelle.thieblemont.pagesperso-orange.fr/java/ecrans/tabprix.jpg?raw=true)
Permet de donner le prix d'une chambre en fonction de sa capacité d'accueil (le nombre de personnes pouvant occuper la chambre) et de sa catégorie

## Lorsque TabPrix(NbPersonnes, N° Catégorie) = 0, cela signifie qu'il n'y a pas de chambre correspondant à la combinaison nombre de personnes/catégorie. 

## TabDescript
![héritage](http://isabelle.thieblemont.pagesperso-orange.fr/java/ecrans/descript.jpg?raw=true)
Permet de donner la description d'un chambre en fonction de sa catégorie



## les classes et le shéma <a name="base"></a>

(voir image sur repo)

 ## Attributs & méthodes<a name="att"></a>
 
## Les attributs
 private int numChamb; 
	  private int numcatego; 
	  private int nbPerso; 

Les attributs représentent l’état interne d’un objet. 
Un attribut a une portée, un type et un identifiant. 
Il est déclaré de la façon suivante dans le corps de la classe Chambre :

## Les méthodes

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


La notion de fonction et de méthode

On appelle fonction un sous-programme qui permet d'effectuer un ensemble d'instruction par simple appel de la fonction dans le corps du programme principal. Les fonctions permettent d'exécuter dans plusieurs parties du programme une série d'instructions, cela permet une simplicité du code et donc une taille de programme minimale. D'autre part, une fonction peut faire appel à elle-même, on parle alors de fonction récursive (il ne faut pas oublier de mettre une condition de sortie au risque sinon de ne pas pouvoir arrêter le programme...).

Une méthode est une fonction faisant partie d'une classe. Elle permet d'effectuer des traitements sur (ou avec) les données membres. 

 ## Encapsulation <a name="enc"></a>
 
  il y a 3 concepts au cœur de la POO : l’héritage, le polymorphisme et enfin l’encapsulation

     
## Principe d’encapsulation 
En quoi consiste l’encapsulation ?
![héritage](https://xperti.io/blogs/wp-content/uploads/2021/12/xblog-Encapsulation.png)

on peut dire type de visibilité d'un attribut ou une opération

L’encapsulation consiste à définir la visibilité et l’accessibilité des propriétés et méthodes d’une classe pour mieux en maîtriser leur utilisation. Pour cela, il suffit de déclarer « private » les données à encapsuler et de définir des méthodes permettant de les lire et de les modifier : on appelle ces méthodes « getter » (pour la lecture) et « setter » (pour la modification).

      private int numChamb; 
	  private int numcatego; 
	  private int nbPerso;  

Getter : méthode « public » permettant de définir la manière de lecture d’un attribut privé. Son type de retour est celui de la donnée retournée et son nom est souvent composé de « get » et du nom de l’attribut qu’elle retourne.
Setter : méthode « public » permettant de définir la manière de modification d’une donnée. Souvent, elle ne retourne rien (« void ») et prend un paramètre du même de type que la donnée à modifier. Son nom se compose de la mention « set » et du nom de l’attribut concerné.

## Astuce

Les getters/setters sont très utilisés en Java mais leur écriture peut être fastidieuse. Les IDE comme Eclipse introduisent un système de génération automatique. Dans Eclipse, faites un clic droit dans votre fichier de classe et choisissez Source > Generate Getters and Setters…

![héritage](https://atika.cohen.web.ulb.be/cours/cours_programmation_cohen/res/poo_pp.jpg)



  ## Agrégation et composition <a name="heri"></a>
 
![héritage](https://media.geeksforgeeks.org/wp-content/uploads/Associatn.png)
 
L’association est une relation entre deux classes distinctes qui s’établit à travers leurs objets. L’association peut être un à un, un à plusieurs, plusieurs à un, plusieurs à plusieurs. Dans la programmation orientée objet, un objet communique avec un autre objet pour utiliser les fonctionnalités et les services fournis par cet objet. La composition et l’ agrégation sont les deux formes d’association. 

## Premiére classe
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

## Deuxiéme Classe
	
package hotel;


public class detailChambre {
	chambre TnumCh[]; 

public detailChambre() { 
	 TnumCh = new chambre[15]; 
	 
	 
	 // affectation 
	 TnumCh[0] = new chambre(1,1,1);
	 TnumCh[1] = new chambre(2,2,1); 
	 TnumCh[2] = new chambre(3,3,1);
	 TnumCh[3] = new chambre(4,4,1); 
	 TnumCh[4] = new chambre(5,1,2);
	 TnumCh[5] = new chambre(6,2,2); 
	 TnumCh[6] = new chambre(7,3,2); 
	 TnumCh[7] = new chambre(8,4,2); 
	 TnumCh[8] = new chambre(9,1,3); 
	 TnumCh[9] = new chambre(10,2,3); 
	 TnumCh[10] = new chambre(11,3,3);
	 TnumCh[11] = new chambre(12,4,3); 
	 TnumCh[12] = new chambre(13,5,3); 
	 TnumCh[13] = new chambre(14,6,3); 
	 TnumCh[14] = new chambre(15,1,4);
	    }
	
	   

	  // Affiche les chambres correspondant à une certaine capacité 
	 	 
	
	  

	public void AffichCh(int nbPersoC,int[][] Tprix, String[] Tcategorie) {
		
		 int nbChamb = 0;  
		 for (int i=0 ; i<=14 ; i++) {
		   if (TnumCh[i].NbPersonne()==nbPersoC) {
			   
			   
	System.out.println("Chambre : "+TnumCh[i].NumeroChambre());  
		  
		   System.out.println("Detail de chambre : /n Catégorie : "+TnumCh[i].Categorie()+ " le prix de chambre : "+TnumCh[i].AfficherPrix(Tprix)+"  ") ;
		    TnumCh[i].AfficherDescript(Tcategorie); 
		    nbChamb++;
		   } 
		  } 
		 System.out.println("Nombre de chambres : "+nbChamb); 
		  } 
		}
## Le main <a name="main"></a>

La méthode main constitue la partie principale du programme, permettant l'exécution de notre application . public indique que la méthode peut être appelée par n'importe quel objet.


public class hotel {

	public static void main(String[] args) {
		//tableau de deux dimension
		//tableau des prix des chambres
		
		int Tprix[][]  = { 
			       {100, 120, 130,150,0,0}, 
			       {130, 160, 170,190,0,0}, 
			       {170, 200, 210,230,270,350}, 
			       {200, 230, 240,260,300,400}
			  };
		
		// tableau d'un seul dimension 
		// tableau des descriptions des chambres
		
		 String Tcategorie[] = 
				 {"Lavabo",
				  "WC, television",
				  "Cabine douche, television",
				  "WC, cabine douche, Television",
				  "WC, Salle de bain + douche, Television",
				  "2 pièces, WC, Salle de bain + douche, Television" } ; 
		 
		 chambre ch = new chambre(4,4,1); 
		  System.out.println("la categorie : "+ch.Categorie()); 
		  System.out.println("La capacite des personnes  : "+ch.NbPersonne()); 
		  System.out.println("Le Prix est: "+ch.AfficherPrix(Tprix)); 
		  ch.AfficherDescript(Tcategorie); 

		  detailChambre det = new detailChambre(); 
		  det.AffichCh(1,Tprix,Tcategorie); 
		 
	}

}


 

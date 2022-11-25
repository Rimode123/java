package hotel;

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

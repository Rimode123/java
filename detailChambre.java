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

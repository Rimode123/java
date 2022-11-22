package rim.demo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class personne {

	public static void main(String[] args) {
		
		List listeNat=new ArrayList<>();
		listeNat.add("Maroc");
		
		List listeNat2=new ArrayList<>();

		listeNat2.add("india");
		List listeNat3=new ArrayList<>();
		listeNat3.add("France");
		
		personneDetail premierP = new personneDetail("Idrissi Zouggari","Rim",LocalDate.of(1994, 07, 17),LocalDate.of(2022,11,21),listeNat,"+33771687325");
		personneDetail deuxemepremierP = new personneDetail("Telegalapalli","Sowmya",LocalDate.of(1991, 06, 18),LocalDate.of(2022,11,21),listeNat2,"+33771543325");
		personneDetail troisiemeP = new personneDetail("Fattore","Fabien",LocalDate.of(1979, 12, 05),LocalDate.of(2022,11,21),listeNat3,"+33771687569");
		
		// Affichage en sortie terminal
		
		System.out.println("la premiere personne est : "+premierP);
		System.out.println("la deuxeme personne est : "+deuxemepremierP);
		System.out.println("la troisieme personne est : "+troisiemeP);
		
	}

}

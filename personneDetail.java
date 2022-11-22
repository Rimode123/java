package rim.demo;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class personneDetail {

String nom;
String prenom;
LocalDate dateNaissance;
LocalDate insp;
List<String> nat;
String numTel;

public personneDetail(String nom, String prenom, LocalDate dateNaissance, LocalDate insp, List<String> nat,
		String numTel) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.dateNaissance = dateNaissance;
	this.insp = insp;
	this.nat = nat;
	this.numTel = numTel;
} 
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public LocalDate getDateLieuNaissance() {
	return dateNaissance;
}
public void setDateLieuNaissance(LocalDate dateLieuNaissance) {
	this.dateNaissance = dateLieuNaissance;
}
public LocalDate getInsp() {
	return insp;
}
public void setInsp(LocalDate insp) {
	this.insp = insp;
}
public List<String> getNat() {
	return nat;
}
public void setNat(List<String> nat) {
	this.nat = nat;
}
public String getNumTel() {
	return numTel;
}
public void setNumTel(String numTel) {
	this.numTel = numTel;
}
@Override
public String toString() {
	return "personneDetail [nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance + ", insp="
			+ insp + ", nat=" + nat + ", numTel=" + numTel + "]";
}

}

# Java

## Journal de java (2022)

## Table des matières

[1. Présentation de Java](#java)
[2.Types de base ](#base)
[3.Attributs & méthodes](#att) 
[4.Principe d’encapsulation](#enc)
[5.Héritage et composition](#Heri)
[6.Les classes abstraites](#abs)
[7.Le polymorphisme](#poly)

### Semaine du 21/11

## Présentation de Java<a name="java"></a>

  
- Java est un langage de programmation à usage général, évolué et orienté objet dont la syntaxe est proche du C. Ses caractéristiques ainsi que la richesse de son écosystème et de sa communauté lui ont permis d'être très largement utilisé pour le développement d'applications de types très disparates. Java est notamment largement utilisé pour le développement d'applications d'entreprises et mobiles .;​

## Types de base  <a name="base"></a>
- Il existe huit types de base en Java :

    des types entier : byte, short, int, long ;
    un type caractère : char ;
    un type booléen : boolean ;
    deux types flottants : float et double.

Les types de base ne définissent pas d’objet. Quand on déclare une variable de type int, la machine Java nous donne en retour une zone mémoire de 4 octets, qui peut contenir un int. L’opérateur d’affectation recopie la valeur de la variable cible dans la variable destination. Prenons un exemple :

  int i, j ;
 i =  0 ;  
 j = i ;   
 i =  1 ;
 
 ## Objet 
 Java est langage orienté objet. Cela signifie que (presque) tout est un objet. La définition d’un objet s’appelle une classe. Donc programmer en Java revient à déclarer des classes, à instancier des objets à partir des classes déclarées ou fournies et à effectuer des opérations sur ces objets.
 
## Déclarer une classe
 En Java, une classe est déclarée dans son propre fichier qui doit porter le même nom que la classe avec l’extension .java. Il nous faut donc créer le fichier Voiture.java :


* Une première classe représentant une personne

public class Personne {

}
## Anatomie d’une classe

En Java une classe est déclarée par le mot-clé class suivi du nom de la classe. On ouvre un bloc avec des accolades pour déclarer le contenu de la classe.

La déclaration d’une classe peut contenir :

des attributs

    Les attributs représentent l’état interne d’un objet. Par exemple,  la personne peut avoir un attribut pour mémoriser sa date d'inscription.
des méthodes

    Les méthodes représentent les opérations que l’on peut effectuer sur un objet de cette classe.
des constantes

    Les constantes sont un moyen de nommer des valeurs particulières utiles à la compréhension du code.
des énumérations

    Les énumérations sont des listes figées d’objets.
des classes internes

    Un classe peut contenir la déclaration d’autres classes que l’on appelle alors classes internes (inner classes). 



 ## Attributs & méthodes<a name="att"></a>
 
## Les attributs

Les attributs représentent l’état interne d’un objet. 
Un attribut a une portée, un type et un identifiant. 
Il est déclaré de la façon suivante dans le corps de la classe :

[portée] [type] [identifiant];

public class Personne {

  public String nom;
  public LocalDate dateNaissance;

}
La classe ci-dessus ne contient que des attributs, elle s’apparente à une simple structure de données. Il est possible de créer une instance de cette classe avec l’opérateur new et d’accéder aux attributs de l’objet créé avec l’opérateur . :

Personne p = new Personne();
p.nom = "Rim";
p.dateInscription = LocalDate.of(2022, 07, 17);

## L’initialisation

En Java, on peut indiquer la valeur d’initialisation d’un attribut pour chaque nouvel objet.

public class Personne {

  public String nom = "Rim";
  public LocalDate dateInscription = LocalDate.of(1994, 07, 17);

}
## Les méthodes

Les méthodes permettent de définir le comportement des objets. nous avons vu précédemment qu’une méthode est définie pas sa signature qui spécifie sa portée, son type de retour, son nom et ses paramètres entre parenthèses. La signature est suivie d’un bloc de code que l’on appelle le corps de méthode.

[portée] [type de retour] [identifiant] ([liste des paramètres]) {
  [code]
}
Dans ce corps de méthode, il est possible d’avoir accès au attribut de l’objet. Si la méthode modifie la valeur des attributs de l’objet

public class Personne {
  /**
  private string nom;
   * @return Le nom  de la personne
   */
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
  }
}

 ## Encapsulation <a name="enc"></a>
 
## Principe d’encapsulation
En programmation objet, le principe d’encapsulation nous incite à contrôler et limiter l’accès au contenu de nos classes au strict nécessaire afin de permettre le couplage le plus faible possible. L’encapsulation en Java est permise grâce à la portée private.

On considère que tous les attributs d’une classe doivent être déclarés private afin de satisfaire le principe d’encapsulation.

Cependant, il est parfois utile pour le client d’une classe d’avoir accès à une information qui correspond à un attribut de l’état interne de l’objet. Plutôt que de déclarer cet attribut public, il existe en Java des méthodes dont la signature est facilement identifiable et que l’on nomme getters et setters (les accesseurs). Ces méthodes permettent d’accéder aux propriétés d’un objet ou d’une classe.

getter

    Permet l’accè à une personne. La signature de la méthode se présente sous la forme :

   public String getNom() {
	return nom;
	
    
    setter

    Permet l’accès  à une personne. La signature de la méthode se présente sous la forme :

   
public void setNom(String nom) {
	this.nom = nom;
}
Avec les getters/setters, il est également possible de contrôler si une propriété est consultable et/ou modifiable. Si une propriété n’est pas consultable, il ne faut pas déclarer de getter pour cette propriété. Si une propriété n’est pas modifiable, il ne faut pas déclarer de setter pour cette propriété.

## Astuce

Les getters/setters sont très utilisés en Java mais leur écriture peut être fastidieuse. Les IDE comme Eclipse introduisent un système de génération automatique. Dans Eclipse, faites un clic droit dans votre fichier de classe et choisissez Source > Generate Getters and Setters…

 ## Héritage et composition <a name="heri"></a>
 Une application Java est composée d’un ensemble d’objets. Un des intérêts de la programmation objet réside dans les relations que ces objets entretiennent les uns avec les autres. Ces relations sont construites par les développeurs et constituent ce que l’on appelle l’architecture d’une application. Il existe deux relations fondamentales en programmation objet :

est un (is-a)

    Cette relation permet de créer une chaîne de relation d’identité entre des classes. Elle indique qu’une classe peut être assimilée à une autre classe qui correspond à une notion plus abstraite ou plus générale. On parle d’héritage pour désigner le mécanisme qui permet d’implémenter ce type de relation.
a un (has-a)

    Cette relation permet de créer une relation de dépendance d’une classe envers une autre. Une classe a besoin des services d’une autre classe pour réaliser sa fonction. On parle également de relation de composition pour désigner ce type de relation.

L’héritage (is-a)

Imaginons que nous voulions développer un simulateur de conduite. Nous pouvons concevoir une classe Voiture 

public class Voiture {

  private final String marque;
  private float vitesse;

  public Voiture(String marque) {
    this.marque = marque;
  }

  // ...

}

Mais nous pouvons également rendre possible la simulation d’une moto. Dans ce cas, nous aurons également besoin d’une classe Moto.

public class Moto {

  private final String marque;
  private float vitesse;

  public Moto(String marque) {
    this.marque = marque;
  }

  // ...

}
![héritage](https://gayerie.dev/epsi-b3-java/_images/heritage_vehicule.png)

Pour ce type de relations, nous pouvons utiliser l’héritage pour faire apparaître une classe réprésentant une notion plus générale ou plus abstraite. Dans notre exemple, il pourrait s’agir de la classe Vehicule. Les classes Voiture et Moto peuvent hériter de cette nouvelle classe puiqu’une voiture est un véhicule et une moto est un véhicule.

## En Java, l’héritage est indiqué par le mot clé extends après le nom de la classe. On dit donc qu’une classe en étend une autre. La classe qui est étendue est appelée classe mère ou classe parente et la classe qui étend est appelée classe fille ou classe enfant.


public class Voiture extends Vehicule {

  private final String marque;
  private float vitesse;

  public Voiture(String marque) {
    this.marque = marque;
  }
  
  ## ET
  public class Moto extends Vehicule {

  private final String marque;
  private float vitesse;

  public Moto(String marque) {
    this.marque = marque;
  }
  
  Le terme d’héritage vient du fait qu’une classe qui en étend une autre hérite de la définition de sa classe parente et notamment de ses attributs et de ses méthodes. Par exemple, les classes Voiture et Moto ont en commun la déclaration de l’attribut vitesse. Cet attribut semble donc faire partie de la généralisation commune de Vehicule.
  
  ## Les classes abstraites <a name="abs"></a>
 
Nous avons vu que l’héritage est un moyen de mutualiser du code dans une classe parente. Parfois cette classe représente une abstraction pour laquelle il n’y a pas vraiment de sens de créer une instance. Dans ce cas, on peut considérer que la généralisation est abstraite.

## REMARQUE

## Par opposition, on appelle classe concrète une classe qui n’est pas abstraite.
___
## Déclarer une classe abstraite

Exemple de la classe Vehicule :


public class Vehicule {

  private final String marque;
  protected float vitesse;

  public Vehicule(String marque) {
    this.marque = marque;
  }

  public void accelerer(float deltaVitesse) {
    this.vitesse += deltaVitesse;
  }

  public void decelerer(float deltaVitesse) {
    this.vitesse = Math.max(this.vitesse - deltaVitesse, 0f);
  }

  // ...

}
Cette classe peut avoir plusieurs classes filles comme Voiture ou Moto. Finalement, la classe Vehicule permet de faire apparaître un type à travers lequel il sera possible de manipuler des instances de Voiture ou de Moto. Il y a peu d’intérêt dans ce contexte à créer une instance de Vehicule. Nous pouvons très facilement l’empêcher en déclarant par exemple le constructeur avec une portée protected. En Java, nous avons également la possibilité de déclarer cette classe comme abstraite (abstract).

public abstract class Vehicule {

  private final String marque;
  protected float vitesse;

  public Vehicule(String marque) {
    this.marque = marque;
  }

  public void accelerer(float deltaVitesse) {
    this.vitesse += deltaVitesse;
  }

  public void decelerer(float deltaVitesse) {
    this.vitesse = Math.max(this.vitesse - deltaVitesse, 0f);
  }

  // ...

}
## En Java, il n’est pas possible de combiner abstract et final dans la déclaration d’une classe car cela n’aurait aucun sens. Une classe abstraite ne pouvant être instanciée, il faut nécessairement qu’il existe une ou des classes filles.

## Le polymorphisme<a name="poly"></a>

- Principe du polymorphisme

On a la classe Animal. Cette classe offre une méthode crier. Pour simplifier notre exemple, la méthode se contente d’écrire le cri de l’animal sur la sortie standard.


public class Animal {

  public void crier() {
    System.out.println("un cri d'animal");
  }

}

## Nous disposons également des classes Chat et Chien qui héritent de la classe Animal.


public class Chat extends Animal {

}

package fr.epsi.b3.animal;

public class Chien extends Animal {

}

Ces deux classes sont une spécialisation de la classe Animal. À ce titre, elles peuvent redéfinir (override) la méthode crier.


public class Chat extends Animal {

  public void crier() {
    System.out.println("Miaou !");
  }

}

## classe chien 
public class Chien extends Animal {

  public void crier() {
    System.out.println("Whouaf whouaf !");
  }

}

Chaque classe fille change le comportement de la méthode crier. Cela signifie qu’un objet de type Chien pour lequel on invoque le méthode crier ne fournira pas le même comportement qu’un objet de type Chat. Et cela, quel que soit le type de la variable qui référence ces objets.

Animal animal = new Animal();
animal.crier(); // affiche "un cri d'animal"

Chat chat = new Chat();
chat.crier();   // affiche "Miaou !"

Chien chien = new Chien();
chien.crier();  // affiche "Whouaf whouaf !"

animal = chat;
animal.crier(); // affiche "Miaou !"

animal = chien;
animal.crier(); // affiche "Whouaf whouaf !"

L’exemple de code ci-dessus montre que l’implémentation de la méthode crier dépend du type réel de l’objet et non pas du type de la variable qui le référence.































 

![héritage](https://www.tresfacile.net/wp-content/uploads/2018/12/avenir-Java-poo.png)

# POO ==> la programmation Orientée Objet

![héritage](http://2.bp.blogspot.com/-8w_NJrVnuDg/VGt9_efBXaI/AAAAAAAAAFo/tJi9gWo251U/s1600/cours-programmation-oriente-objet.gif)


## Journal de POO en java (2022)

## Table des matières

1. [1. Présentation de POO](#poo)
2. [2.les classes et les objets ](#base)
3. [3.Attributs & méthodes](#att) 
4. [4.Principe d’encapsulation](#enc)
5. [5.Héritage et composition](#Heri)
6. [6.Les classes abstraites](#abs)
7. [7.Le polymorphisme](#poly)

### Semaine du 21/11

## Présentation de programmation Orientée Objet<a name="poo"></a>

 ## la programmation orientée objet est un style de programmation qui s’articule autour d’objets renfermant des données et des mécanismes 

Avantages :

   - Elle traduit un univers complexe en de petits ensembles simples et autonomes (Objets),
    Elle permet de sécuriser nos données en définissant des règles d’accès et de modification,
    Elle permet de travailler à plusieurs sur un même projet composé de plusieurs briques.

![héritage](https://1.bp.blogspot.com/--zuontioJCQ/XW2yWyFb9aI/AAAAAAAAG7U/YM0PLzETG0MFCELkTab-WnTUpXZLnmdUACLcBGAs/s1600/poo.png)

## les classes et les objets<a name="base"></a>

## Qu’est-ce qu’une classe en java ?

Une Classe est un ensemble d’attributs et de méthodes (fonctions). En outre elle représente l’ensemble des caractéristiques et des mécanismes d’un concept du monde réel.
## Que représente un objet en Java ?

Un objet est un conteneur qui contient un ensemble de données avec des mécanismes intégrés permettant de les manipuler.

## Quelle est la différence (ou relation) entre une classe et un objet ?

Il est important de distinguer la relation et les différences existant entre une classe et un objet :

    -Un objet est une instance d’une classe. Tandis qu’une classe est définie comme étant un « Template » correspondant à un élément du monde réel.
    
    -Normalement, on devrait parler d’objet qu’à l’exécution d’un programme.
    -Un objet est créé grâce au mot clé « new » en utilisant un constructeur, alors qu’une classe est définie avec le mot clé « class ».
    
    -Au cours de l’exécution, on peut avoir plusieurs objets instances d’une classe, alors que la classe concernée n’est déclarée qu’une seule fois.
    
    -La création d’un objet nécessite l’allocation de mémoire, cependant ce n’est pas le cas pour une classe.
    
![héritage](https://qph.cf2.quoracdn.net/main-qimg-34cf1e67f523bb08f457b9abc5d5cb65)

Les classes et les objets sont les composants fondamentaux de la POO.

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
 
  il y a 3 concepts au cœur de la POO : l’héritage, le polymorphisme et enfin l’encapsulation

 
## Principe d’encapsulation 
En quoi consiste l’encapsulation ?
![héritage](https://xperti.io/blogs/wp-content/uploads/2021/12/xblog-Encapsulation.png)

on peut dire type de visibilité d'un attribut ou une opération

L’encapsulation consiste à définir la visibilité et l’accessibilité des propriétés et méthodes d’une classe pour mieux en maîtriser leur utilisation. Pour cela, il suffit de déclarer « private » les données à encapsuler et de définir des méthodes permettant de les lire et de les modifier : on appelle ces méthodes « getter » (pour la lecture) et « setter » (pour la modification).

Getter : méthode « public » permettant de définir la manière de lecture d’un attribut privé. Son type de retour est celui de la donnée retournée et son nom est souvent composé de « get » et du nom de l’attribut qu’elle retourne.
Setter : méthode « public » permettant de définir la manière de modification d’une donnée. Souvent, elle ne retourne rien (« void ») et prend un paramètre du même de type que la donnée à modifier. Son nom se compose de la mention « set » et du nom de l’attribut concerné.

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

![héritage](https://atika.cohen.web.ulb.be/cours/cours_programmation_cohen/res/poo_pp.jpg)



  ## Héritage et composition <a name="heri"></a>
 
![héritage](https://miro.medium.com/max/1400/1*_14-yZeofO4AghAKbXiBPw.png)
 
L’héritage consiste à définir une classe par extension des mécanismes et attributs d’une autre classe. En outre, pour un ensemble d’entités du monde réel donné, cela consiste à regrouper leurs caractéristiques communes dans une classe mère de laquelle seront dérivées les classes (filles) correspondant à ces entités.

A retenir :

    En Java, il est impossible d’hériter de deux ou plusieurs classes. Si un tel besoin se présente, on pourrait se servir des « interfaces ».
    L’héritage se fait grâce au mot-clé « extends »,
    L’appel d’un constructeur de la classe mère depuis une classe fille se fait avec le mot-clé « super ».
    L’héritage permet d’éviter de répéter un code plusieurs fois et de ne pas modifier un code déjà existant dans une classe de base :
        Exemple : Class Point à Namedpoint : un point nommé en plus de ses coordonnées et mécanismes intégrés.
    Il existe en Java des classes non héritables, par exemple, la classe « String ».
 ## EXEMPLE
Imaginons que nous voulions développer un simulateur de conduite. Nous pouvons concevoir une classe Voiture 

public class Voiture {

  private final String marque;
  private float vitesse;

  public Voiture(String marque) {
    this.marque = marque;
  }

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


![héritage](https://i0.wp.com/tutorial.eyehunts.com//wp-content/uploads/2018/12/Java-polymorphism-example-and-diagram-animal-1024x757.png?resize=1024%2C757&ssl=1)































 

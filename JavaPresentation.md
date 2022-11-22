
Principe du polymorphisme

Prenons l’exemple de la classe Animal. Cette classe offre une méthode crier. Pour simplifier notre exemple, la méthode se contente d’écrire le cri de l’animal sur la sortie standard.

package fr.epsi.b3.animal;

public class Animal {

  public void crier() {
    System.out.println("un cri d'animal");
  }

}

Nous disposons également des classes Chat et Chien qui héritent de la classe Animal.

package fr.epsi.b3.animal;

public class Chat extends Animal {

}

package fr.epsi.b3.animal;

public class Chien extends Animal {

}

Ces deux classes sont une spécialisation de la classe Animal. À ce titre, elles peuvent redéfinir (override) la méthode crier.

package fr.epsi.b3.animal;

public class Chat extends Animal {

  public void crier() {
    System.out.println("Miaou !");
  }

}

package fr.epsi.b3.animal;

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


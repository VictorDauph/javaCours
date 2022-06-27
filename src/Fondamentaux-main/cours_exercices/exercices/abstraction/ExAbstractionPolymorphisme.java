/**
 * Exercice Abstraction / Polymorphisme
 * 
 * Créer une classe abstraite ayant 3 methodes :
 * getCommentCaVa, getLangue et traduireCommentCaVa.
 * les deux première méthodes sont abstraitent.
 * la dernière méthode affichera "Eb .... on dit : ...." en utilisatnt les méthodes abstraites.
 * 
 * Ecrire 3 classes de langues differentes qui surchargerons les méthodes abstraites de la classe précédente.
 * Elles permettrons d'indiquer la langue et le texte dans la langue correspondante à la phrase 
 * comment ca va ?
 * 
 * Ecrire une classe principale qui créera une instance des 3 classes de langues
 * et qui applera la méthode traduireCommentCaVa pour chauqe langue et affichera par exemple :
 * En anglais on dit : "How are you ?"
 * 
 * Creer une objet de la classe langue via le polymorphisme et appeler la methode traductionCommentCaVa().
 */

package cours_exercices.exercices.abstraction;

// Classe abstraite
abstract class AbstractedClass {
    abstract public String getCommentCaVa();
    abstract public String getLangue();
    public void traduireCommentCaVa(){
        System.out.println("En "+ getLangue()+" on dit : "+ getCommentCaVa());
    };
}

// Classe Anglais
class Anglais extends AbstractedClass{
    
    @Override public String getLangue(){
        return "Anglais";
    }
    
    @Override public String getCommentCaVa(){
        return "How do you do?";
    }
}

// Classe Italien
class Italien extends AbstractedClass{
    
    @Override public String getLangue(){
        return "Italien";
    }
    
    @Override public String getCommentCaVa(){
        return "Sto scoregiando";
    }
}

// Classe Espagnol
class Espagnol extends AbstractedClass{
    
    @Override public String getLangue(){
        return "Espagnol";
    }
    
    @Override public String getCommentCaVa(){
        return "Que tal hombre?";
    }
}

// Classe principale
public class ExAbstractionPolymorphisme {
        public static void main(String[] args) {
            AbstractedClass anglais = new Anglais();
            AbstractedClass espagnol = new Espagnol();
            AbstractedClass italien = new Italien();
            anglais.traduireCommentCaVa();
            espagnol.traduireCommentCaVa();
            italien.traduireCommentCaVa();
            
    }
}
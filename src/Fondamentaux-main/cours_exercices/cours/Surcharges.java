/**
 * Exemple sur les surcharges
 */

package cours_exercices.cours;

// Classe Imprimante avec surcharge de la méthode imprimer()
class Imprimante{
    public void imprimer(){
        System.out.println("Page de test");
    }
    
    public void imprimer(String document1,String document2){
        System.out.println("Imprimer1");
        System.out.println(document1 + " " + document2 );        
    }
    
    public void imprimer(String... document1){
        System.out.println("imprimer2");
        
        for(String doc : document1){
            System.out.println(doc);
        }
    }
    
    public void imprimer(String document, Integer nombre){
        System.out.println(" imprimer 3");
        
        for (int i=0; i<nombre; i++){
            System.out.println(document);
        }
    }
}
// Classe principale
public class Surcharges {
    public static void main(String[] args) {
        Imprimante i = new Imprimante();
        
        i.imprimer();
        i.imprimer("document1");
        i.imprimer("doc2", "doc3");
        i.imprimer("doc5", "docGyneco");
        i.imprimer("celui qui lit ça est un BG", 3);
        i.imprimer("7","8","9");
        
    }
}
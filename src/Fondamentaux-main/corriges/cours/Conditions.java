/**
 * Exercice sur les condtions
 */

package corriges.cours;

// Classe principale
public class Conditions {
    public static void main(String[] args) {
        // Definition d'attributs
	int a = 5;
	int b = 10;
	
	// Condition if / else
	if (a == b) {
            System.out.println("a = b");
	}
	else {
            if (a < b) {
		System.out.println("a < b");
		}
            else {
		System.out.println("a > b");
            }
	}
		
	// Condition switch
	switch (a) {
            case 1 : 
		System.out.println("a = 1");
		break;
		
            case 2 : 
		System.out.println("a = 2");
		break;
		
            case 5 : 
		System.out.println("a = 5");
		break;
		
            case 10 : 
		System.out.println("a = 10");
		break;
		
            default :
		System.out.println("a = inconnu");
		break;
        }
		
        // Nouveau switch case depuis JDK 14
        switch(a) {
            case 0, 1, 2, 3, 4 -> System.out.println("Petit chiffre");
            case 5, 6, 7, 8, 9 -> System.out.println("Grand chiffre");
            default -> System.out.println("Ce n'est plus un chiffre, mais un nombre");
        }

        // Nouveanu switch case sous forme d'expression
        // Attention au ; à la fin.
        String result = switch(a) {
            case 0, 1, 2, 3, 4 -> "Petit chiffre";
            case 5, 6, 7, 8, 9 -> "Grand chiffre";
            default -> "Ce n'est plus un chiffre, mais un nombre";
        };

        System.out.println(result);

        // Le nouveau switch case peut être dans un appel de methode.
        System.out.println(switch(a) {
            case 0, 1, 2, 3, 4 -> "Petit chiffre";
            case 5, 6, 7, 8, 9 -> "Grand chiffre";
            default -> "Ce n'est plus un chiffre, mais un nombre";
        });
        
        // Nouveau switch sous forme d'expression utilsant yield
        // (quand le retour se fait sur plusieurs lignes)
        String result2 = switch(a) {
            case 0, 1, 2, 3, 4 -> {
                double sqrt = Math.sqrt(a);
                yield "Petit chiffre dont la racine carré vaut " + sqrt;
            }
            case 5, 6, 7, 8, 9 -> {
                double square = a * a;
                yield "Grand chiffre dont le carré vaut " + square;
            }
            default -> "Ce n'est plus un chiffre, mais un nombre";
        };
        System.out.println(result2);
        
	// Condition ternaire
	boolean resultat = (a == b) ? true : false;
	System.out.println(resultat);
    }
}
/*
* Exercice Tableaux
* 
* 1. Ecrire dans un tableau les valeurs suivantes : 1, 1, 2, 3, 5, 8, 13, 21
* 2. Créer un autre tableau ayant un élément de plus que le premier initialiser à 0.
* 3. Afficher les éléments du premier tableau
* 4. Afficher les éléments du 2eme tableau
* 5. Copier les valeurs du premier tableau dans le second et insérer une valeur aribitraire à la 3eme position 
* 6. Afficher le tableau après l'opération d'insertion
*/
 
package cours_exercices.exercices.tableaux;

// Classe principale

import java.util.Arrays;

public class ExTableaux {
    public static void main(String[] args) {
        // Afficher les éléments du tableau original
        int[] tab1={1, 1, 2, 3, 5, 8, 13, 21};
        
        // Afficher les éléments du nouveau tableau
        System.out.println("tab1 : "+Arrays.toString(tab1));

        // Copie des éléments du premier tableau
        // et insertion d'un élément à la 3eme position
        int[] tab2=new int[tab1.length+1];
        System.out.println("tab2 : "+Arrays.toString(tab2));
        
        
        for(int i=0; i<tab1.length; i++){
            tab2[i]=tab1[i];
        }
        
        int[] tab3=new int[tab1.length+1];
        System.arraycopy(tab1, 0, tab3, 0, tab1.length);
        System.out.println("tab 3: "+Arrays.toString(tab3));
        
        tab2[2]=5;
        
        // Afficher le tableau après l'opération d'insertion
        System.out.println("tab 2 modifié: "+Arrays.toString(tab2));
        // Messaged de fin
        System.out.println("va te faire cuire le uc");     
    }
}
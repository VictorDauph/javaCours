/**
 * Exemple sur les tableaux
 */

package cours_exercices.cours;

// Classe principale

import java.util.Arrays;

public class Tableaux {
    public static void main(String[] args) {
	// Déclaration d'un tableau sans l'alimenter
	String[] t1= new String[5];
        
        
	// Affectation des valeurs à un tableau
	// Remarque : le premier indice du tableau est 0
        t1[0]= "chaine 1";
        t1[1]= "chaine 2";
        t1[2]= "chaine 3";
        t1[3]= "chaine 4";
	
        
	// Affichage d'une valeur d'un tableau
        System.out.println("accès à une valeur de t1 vide sting : "+t1[0]);
	
	// Affichage d'une valeur non attribué d'un tableau (cela est égale à null)
	// Vouloir accéder a un index non inclus dans un tableau génère une exception
        System.out.println("accès à une valeur de t1 vide : "+t1[4]);
	
	// Déclaration d'un tableau sans déclarer son nombre d'éléments et alimenté directement
	Integer[] t2 ={5,3,8,2,6,10000};
        System.out.println(t2[5]);
        
        // Parcours du tableau pour afficher les éléments
        for (Integer elem:t2){
            System.out.println(elem);
        }
        System.out.println("manip pour print un tableau : "+Arrays.toString(t2));

        // Tableau à deux dimensions
        String[][]t3= new String[5][3];
        t3[0][0]= "val 00";
        t3[0][1]= "val 01";
        t3[1][0]= "val 02";
        
        //ou
        int[][] tab = {{1,2},{3,4},{5,6}};
        
        // Affichage des dimensions du tableau
        System.out.println("longueur première dimension : "+ t3.length); 
        System.out.println("longueur deuxième dimension : "+ t3[0].length); //2eme dimension si 1 paire de crochets, 3eme dimension si 2 paires de crochet
        System.out.println("longueur deuxième dimension : "+ t3[1].length);
        
        // Parcours du tableau pour afficher le contenu.
        for(String[] elem : t3){
            System.out.println("elem : "+Arrays.toString(elem));
            for(String val : elem) {
                System.out.println(val);
            }
        }
    }
}
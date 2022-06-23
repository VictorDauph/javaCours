/**
 * Exercice Boucles
 * 
 * 1. Afficher tous les nombres entiers de 1 à 20 en utilisant la boucle for et while.
 * 2. Afficher les 20 premiers résultats d'une table de multiplication
 * sous la forme : 1 x 5 = 5 etc...
 * 3. Afficher les tables de multiplication pour les nomùbre de 5 à 10 inclus
 */
package cours_exercices.exercices.boucles;

public class ExBoucles {
    public static void main(String[] args) {
        // Affichage avec la boucle for
        System.out.println("boucle for");
        
        
        for (int cpt=1; cpt<=20; cpt++){
            System.out.println(cpt);
        }
        
        //saut de ligne
        System.out.println("boucle while");
        
        // Affichage avec la boucle while
        int cpt=1;
        
        while(cpt<=20){
            System.out.println(cpt);
            cpt++;
        }
        
        //saut de ligne
        System.out.println();
        
        // Table de multiplication
        System.out.println("table de multiplication 5");
        
        cpt=1;
        
        while(cpt<=20){
            int result = 5*cpt;
            System.out.println(cpt+"x5 ="+result);
            cpt++;
        }
        
        //saut de ligne
        System.out.println("tables de multiplications 5-10");
        
        // Table de multiplication des nombres 5 à 10 inclus
        //double boucle imbriquées, la for est dans la while.
        cpt=1;
        
        while(cpt<=20){
            for(int i=5; i<=10; i++){
                int result = i*cpt;
                System.out.println(cpt+"x"+ i +"="+result);
            }
            cpt++;
        }
    }
}
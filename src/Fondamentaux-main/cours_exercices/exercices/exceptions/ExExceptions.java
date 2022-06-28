/**
 * Exercice Exceptions
 * 
 * Ecrire un programme qui demande à l’utilisateur de saisir une liste d’entiers puis à l’aide
 * de parcours successifs de la liste effectuer les actions suivantes :
 * 1) Afficher la liste
 * 2) Afficher la liste en colonne de manière à afficher l’index et le contenu
 * 3) Créer une nouvelle liste qui sera chaque éléments de la liste multiplié par 3
 * 4) Obtenir le plus grand nombre de la liste
 * 5) Obtenir le plus petit nombre de la liste 
 * 6) Compter le nombre des nombres pairs présents dans la liste
 * 7) Calculer la somme de tous les nombres impairs de la liste
 * NB: le programme doit gérer les exceptions au niveau de la saisie des données de l’utilisateur
 */

package cours_exercices.exercices.exceptions;

// Classe principale

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ExExceptions {
    
    public static void main(String[] args) {
        System.out.println("tape un entier, valider en entrant une chaîne vide");
        
        var keyb = new Scanner(System.in);

        ArrayList<Integer> nbList = new ArrayList<>();

        boolean keepGoing=true;
        Integer nb = 0;
        String entry = null;
        
        while(entry != ""){
            try
            {
                entry = keyb.nextLine();
                nb = Integer.parseInt(entry);
                nbList.add(nb);
            }
            catch(Exception e){
                if(entry != ""){
                    System.out.println("Ceci n'est pas une entier, coquinou é");
                    System.out.println(e.getMessage());
                }
            }
        }        
        
        System.out.println("fin boucle, affichage : ");
        System.out.println(nbList);
        
        for(int i=0; i<nbList.size();i++){
            System.out.println("index : "+ i + " nombre : " +nbList.get(i));
        }
        
        ArrayList<Integer> newNbList = new ArrayList<>();
        
        nbList.forEach((elem)->{
            newNbList.add(elem*3);
        });
        
        System.out.println("new Nb List *3 : "+ newNbList);

        System.out.println("Max value : "+Collections.max(nbList));
        System.out.println("Min value : "+Collections.min(nbList));
        
        int pair=0;
        int sommeImpair=0;
        
        for(Integer num:nbList){
            int r=num%2;            
            if(r==0){
                pair++;
            }
            else{
                sommeImpair += num;
            }
        }       
        System.out.println("il y'a "+pair+" nombres pairs");
        System.out.println("somme des impairs " + sommeImpair);
    }
}
/**
 * Exercice Collections
 * 
 * Creer une liste vide
 * Ajouter des éléments de type String à cette liste
 * Insérer un élément au début de la liste
 * Afficher le nombre d'élément contenu dans la liste
 * Afficher la liste
 * Modifier un élément par une autre valeur
 * Parcourir la liste et afficher ses éléments un par un
 * Supprimer un élément de la liste et réafficher la liste
 */

package cours_exercices.exercices.collection;

// Classe principale

import java.util.ArrayList;

public class ExCollection {
    public static void main(String args[]) {
        // Créer un ArrayList
        ArrayList<String> maListe = new ArrayList<>();
        
        // Ajouter des éléments à l'ArrayList
        maListe.add("Val 1");
        maListe.add("Val 2");
        maListe.add("Val 3");
        
        // Insertion d'un élément au début de la liste
        maListe.add(0,"Val 4");

        // Afficher la taille de la liste
        System.out.println("longeur maListe : "+maListe.size());
        
        // Afficher l'ArrayList
        System.out.println("maListe : "+ maListe);

        // Modification d'un élément de la liste
        maListe.set(2, "Val 2000");

        // Parcour de la liste
        System.out.println("for intelligente");
        for(String e : maListe){
            System.out.println(e);
        }
        
        // Supprimer des éléments de l'ArrayList
        maListe.remove(2);

        // Afficher l'ArrayList
         System.out.println("after remove");
        System.out.println(maListe);
        
        // parcour avec la methode ForEach() et une lambda
         System.out.println("forEach");
        maListe.forEach((e)-> System.out.println(e));
    }   
}
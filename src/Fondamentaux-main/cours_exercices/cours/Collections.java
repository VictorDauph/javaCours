/**
 * Exemple sur les collections
 */

package cours_exercices.cours;

// Classe principale

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collections {
    public static void main(String[] args) {
	/// LIST
	// Création d'une liste de type List
	List<String> maListe = new ArrayList<>();
        
        // Ajout d'un élément au premier index disponible
        maListe.add("Valeur 1");
        System.out.println(maListe.get(0) );
        
        // Insert un élément à l'index voulu
        maListe.add(1,"Valeur 2");
        maListe.add(0,"Valeur 3");
        maListe.add("Valeur 3");

        // Création d'une autre liste de Type List chargé avec le contenu de la première
        List<String> maListe2 = new ArrayList<>();
        maListe2.addAll(maListe);
        
        // Parcour avec une boucle for intelligente + Accès à un élément de la liste via son index
        for(String elem : maListe2){
            System.out.println("Elements "+ maListe.indexOf(elem) +" : "+elem);
        }
        // Parcour avec la methode ForEach() et une lambda
        System.out.println("forEach");
        maListe.forEach(elem -> System.out.println("Elements "+ maListe.indexOf(elem) +" : "+elem) );
        
	// Récupère le premier index de la liste ayant pour valeur "valeur 1"
	int indice = maListe.indexOf("Valeur 3");
        System.out.println("indice de valeur 3 : "+indice);
        
	// Récupère le dernier index de la liste ayant pour valeur "valeur 1"
        int dernierIndice = maListe.lastIndexOf("Valeur 3");
        System.out.println("indice de valeur 3 : "+dernierIndice);
	
	// Recherche de l'existence d'un élément dans une liste
        System.out.println(" Valeur 2?" + maListe.contains("Valeur 2") );
        System.out.println("Mangia Capra?" + maListe.contains("Mangia Capra?") );
		
	// Taille de la liste
        System.out.println("Taille de la liste : "+ maListe.size() );
        
	// Suppression de l'élément à l'index 0
	maListe.remove(0);
        System.out.println("Taille de la liste : "+ maListe.size() );
        
	// Suppression de l'élément ayant la valeur "valeur 1"
	maListe.remove("Valeur 1");
        System.out.println("Taille de la liste : "+ maListe.size() );
        
	// Suppression de tous les éléments de la liste
        maListe.clear();
        System.out.println("Taille de la liste : "+ maListe.size() );
	
	/// SET
	// Définition d'une collection Set
	Set<String> monSet= new HashSet<>();
        
        // Charge monAutreListe de type List dans monSet de type Set
        System.out.println("Liste Avant Set : ");
        for(String elem : maListe2){
            System.out.println("Elements : "+elem);
        }
        
        System.out.println("Set : ");
	monSet.addAll(maListe2);
                
	// Affichage du Set, on s'aperçoit qu'il n'y a plus de doublons
        for(String elem : monSet){
            System.out.println("Elements : "+elem);
        }
	
	// Tableau de String chargé
        String[] valeurs = {"un","deux","trois"};
	
	// Conversion du tableau en liste de type List
        List<String> maNouvelleListe= Arrays.asList(valeurs); 
	
	// Affichage de la nouvelle liste
        System.out.println(maNouvelleListe);
        
	// Création d'une liste de type List 
        List<Integer> listInteger = Arrays.asList(3, 9, 1, 4, 7, 2, 5, 3, 8, 9, 1, 3, 8 ,6);
        System.out.println("listInteger : "+ listInteger);
	
	// Conversion en Set d'une liste d'int de Type List, il n'y a plus de doublons
	Set<Integer> setInteger = new HashSet<>(listInteger);
        System.out.println("set integer : "+ setInteger);
        
	// Ajout de la valeur 5, mais elle existe déjà
	setInteger.add(5);
        System.out.println("setInteger après ajout de la valeur 5 : "+ setInteger);
        
	// Création d'une liste de type List 
	List<String> listeString = Arrays.asList("toto","abc","xyz","dede","abc");
        System.out.println("listeString : "+ listeString );
        
	// Conversion en Set d'une liste de String de type List, il n'y a plus de doublons
        Set<String> setString = new HashSet<>(listeString);
        System.out.println("setSrtring : "+ setString);
    }
}
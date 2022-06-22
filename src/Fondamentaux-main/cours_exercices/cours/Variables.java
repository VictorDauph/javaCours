/**
 * Exemple sur les variables
 */

package cours_exercices.cours;

// Classe principale

import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        // Opérateur d'affectation Simple
        int i =1;
        
        // Affichage simple d'une variable
        System.out.println(i);
        
        // Affectation multiple
        String a,b,c=b=a="test";
        int x, y, z= y=x=5;
        
        System.out.println(a+" "+b+" "+c);
        System.out.println(x+" "+y+" "+z);
        
        
        // Boxing
        Integer i2= i;
        System.out.println(i2);

        // Unboxing
        int val=i2;
        System.out.println(val);
        
        // Casting
        int k=5;
        System.out.println((float)k);
        
        // Conversion d'une String en classe Integer
        String chaine="100";
        Integer valInt= Integer.valueOf(chaine);
        System.out.println(chaine+chaine);
        System.out.println(valInt+valInt);
        
        // Conversion d'une String en int primitif
        int j= Integer.parseInt(chaine);
        System.out.println(j);
        
        // Conversion d'un double en String
        double d= 3.1415926;
        String pi= Double.toString(d);
        System.out.println(pi);
        
        // Opérateur arithmétique simple
        i=i+1;
        System.out.println(i);

        // Opérateur unitaire postfixé, l'opération se fait après l'affichage
        System.out.println("postfixé"+ i++);

        // Opérateur unitaire préfixé
        System.out.println("préfixé"+ ++i);

        // Opérateur binaire
        System.out.println(i==j);
        
        // Comparaison avec des chaines de caractères 
        chaine="pi";
        pi="pi";
        System.out.println(chaine.equals(pi));
        System.out.println(chaine==pi); // Attention == ne marche pas avec tous les types d'objets. equals marche mieux
        
        // Opérateur de comparaison logique
        i=i2;
        System.out.println(i==i2 || chaine.equals(pi)); //true||false=true

        // Opérateur de négation
        System.out.println(!chaine.equals(pi)); //!true=false

        // Opérateur avec assignation
        i += 10; //i=i+10
        System.out.println(i); 
        
        // Saisir au clavier et affecter la saisie à une variable
        var keyb = new Scanner(System.in);

        // Récupérer la ligne saisie
        System.out.println("Entrez votre nom :");
        String nom= keyb.nextLine();
        System.out.println(nom+" est un BG");
        
        // Récupérer un caractère
        System.out.println("Entrez votre genre :");
        char genre= keyb.next().charAt(0);
        System.out.println("genre : "+genre);
        
        // Récupérer un entier
        System.out.println("Entrez votre age :");
        int age = keyb.nextInt();
        System.out.println("votre excellent âge est :"+age);
        
        // Récupérer un nombre à virgule (ne pas saisir un point)
        System.out.println("Entrez votre taille :");
        float taille = keyb.nextFloat();
        System.out.println("vous êtes graaaand :"+taille);
        
        // Récupérer un boolean (saisir true ou false seulement)
        System.out.println("êtes vous célibataire?");
        boolean marier= keyb.nextBoolean();
        if (marier==true){
            System.out.println("vous faites quoi ce soir?");
        }
        else{
            System.out.println("je dois y'aller, j'ai piscine");
        }
        // Affichage des variables
        System.out.println("nom :"+nom+ "\nage :"+age); // \n sert à aller à la ligne
        keyb.close();
    }
}
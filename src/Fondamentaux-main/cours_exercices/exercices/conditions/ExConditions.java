/*
 * Exercice conditions
 * 
 * 1. Chercher le plus grand des 3 nombres saisie par l'utilisateur
 * 2. Afficher sur les nombres saisie sont pairs ou impairs
 * 3. Demander à l'utilisateur de saisir le numéro d'un mois de l'année
 * et afficher le nombre de jours correspondant au mois choisi (28/29) pour février
 * indiquer un message d'erreur si le numéro de mois n'est pas compris entre 1 et 12.
 */
package cours_exercices.exercices.conditions;
import java.util.Scanner;
        
public class ExConditions {
    public static void main(String[] args) {
        // Déclarations / définitions des variables
        var keyb = new Scanner(System.in);


        // Fournir les données d'entrée
        System.out.println("Entrez nombre a:");
        int a= keyb.nextInt();
        System.out.println("Entrez nombre b:");
        int b= keyb.nextInt();
        System.out.println("Entrez nombre c:");
        int c= keyb.nextInt();
        
        System.out.println("a : "+a+" b : "+b+" c : "+c);
 
        // Chercher le maximum
        if(a>b && a>c){
            System.out.println("max ="+a);
        }
        else if(b>a && b>c){
            System.out.println("max ="+b);
        }
        else if(c>a && c>b){
            System.out.println("max ="+c);
        }
        else{
            System.out.println("pas de maximum");
        }
 
        // Afficher le résultat
 
        // Afficher si num1 est pair ou impair
        int r=a%2;
        if(r ==0){
            System.out.println("a est pair");
        }else{
            System.out.println("a est impair");
        }
 
        // Fournir les données d'entrée
        System.out.println("Entrez numéro de mois:");
        int mois= keyb.nextInt();
        int r2=mois%2;
        System.out.println(r2);
        if( mois <=0 || mois>12){
            System.out.println("Ceci n'est pas un mois");
        }
        else if(mois==2){
            System.out.println("nombre de jours : 28/29");
        }else if(r2==1 && mois<=8 || r2==0 && mois>=8){
            System.out.println("nombre de jours : 31");
        }else if(r2==1 && mois>=8 || r2==0 && mois<=8){
            System.out.println("nombre de jours : 30");
        }else{
            System.out.println("wtf?");
        }
        
        
        // Afficher le résultat
        
        // Fermer les ressources
        keyb.close();
    }
}
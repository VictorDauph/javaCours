/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cours_exercices.cours;

/**
 *
 * @author Victor
 */

class TestStatic{
    public int cpt=0;
    public static int compteur=5;
    
    public void afficheCompteur(){
        System.out.println("cpt : " + cpt);
        System.out.println("compteur : "+compteur);
    }
}
public class Statique {
    public static void main(String[] args){
        TestStatic ts1 = new TestStatic();
        TestStatic ts2 = new TestStatic();
        
        ts1.afficheCompteur();
        ts2.afficheCompteur();
        
        ts1.cpt=10;
        ts2.cpt=20;
        
        ts1.afficheCompteur();
        ts2.afficheCompteur();
        
        ts1.compteur=50;
        ts1.afficheCompteur();
        ts2.afficheCompteur();
        
        TestStatic ts3 = new TestStatic();
        ts3.afficheCompteur();
        
        TestStatic.compteur=1000;
        ts3.afficheCompteur();
    }
}

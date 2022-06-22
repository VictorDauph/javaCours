/**
 * Exercice sur les condtions
 */

package cours_exercices.cours;

// Classe principale
public class Conditions {
    public static void main(String[] args) {
        // Definition d'attributs
        int a = 5;
        int b=10;
        
	// Condition if / else
	if(a==b){
            System.out.println("a=b");
        }else if(a>b){
            System.out.println("a>b");
        }else{
            System.out.println("a<b");
        }
        
	// Condition switch à l'ancienne
        a=8;
        
	switch(a){
            case 1:
                System.out.println("a="+1);
                break;
            case 5:
                System.out.println("a="+5);
                break;
            default:
                System.out.println("a te dit merde");
                break;
        }
        
        // Nouveau switch case depuis JDK 14
        a=-1;
        switch(a){
            case 1,2,3,4,5 ->{
                System.out.println("petit chiffre");
            }
            case 6,7,8,9,10 ->{
                System.out.println("grand chiffre");
            }
            default-> System.out.println("chiffre naze");
        }
                

        // Nouveau switch case sous forme d'expression
        // Attention au ; à la fin
        
        String result = switch(a){
            case 1,2,3,4,5 ->{
                yield "petit chiffre";
            }
            case 6,7,8,9,10 ->{
                yield "grand chiffre";
            }
            default->"chiffre naze";
        };
        
        System.out.println(result); 
        

        // Le nouveau switch case peut être dans un appel de methode.
        System.out.println(switch(a){
            case 1,2,3,4,5 ->{
                yield "petit chiffre";
            }
            case 6,7,8,9,10 ->{
                yield "grand chiffre";
            }
            default->"chiffre naze";
            });
        
        // Nouveau switch sous forme d'expression utilsant yield
        // (quand le retour se fait sur plusieurs lignes)
        a=4;
        String result2 = switch(a){
            case 1,2,3,4,5 ->{
                double sqrt = Math.sqrt(a);
                yield "petit chiffre sqrt : " + sqrt;
            }
            case 6,7,8,9,10 ->{
                double sqrt = Math.sqrt(a);
                yield "grand chiffre sqrt : " + sqrt;
            }
            default->"chiffre naze2";
        };
        
        System.out.println(result2); 

        
	// Condition ternaire
        a=1;
        boolean result3 = (a>=5)? true:false;
        System.out.println(result3);
    }
}
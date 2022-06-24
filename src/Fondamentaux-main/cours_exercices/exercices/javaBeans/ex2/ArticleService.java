/**
 * Exercice JavaBean 2
 * 
 * Créer une classe ArticleService définissant une méthode creerArticle
 * qui à un parametre de type Article.
 * Cette methode doit afficher le libéllé et le numéero de l'article.
 */

package cours_exercices.exercices.javaBeans.ex2;

// Import de Serializable pour créer un JavaBean
import java.io.Serializable;

// Classe ArticleService
public class ArticleService implements Serializable{
    // Méthode afficherAriticle
    public void afficherArticle(Article article){
        System.out.println(article.getNumero()+ " : "+ article.getLibelle());
    }
}
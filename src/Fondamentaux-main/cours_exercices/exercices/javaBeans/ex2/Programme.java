/**
 * Exercice JavaBean 2
 * 
 * Programme principale.
 * Créer un objet du JavaBean Article et définir ses propriétés.
 * Creer un objet de la classe ArticleService.
 * Afficher les informations sur l'article et utilisatnt la methode creerArticle de la classe ArticleService.
 */

package cours_exercices.exercices.javaBeans.ex2;

// Classe principale
public class Programme {
    public static void main(String[] args) {
        Article art = new Article(1,"ceci est un article");
        Article art2 =new Article();
        ArticleService service = new ArticleService();
        
        service.afficherArticle(art);
        service.afficherArticle(art2);
    }
}

package TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class Inici {

	public static void main(String[] args) {
		TreeSet <String> persones = new TreeSet <String>();
		
		persones.add("Lara");
		persones.add("Rosa");
		persones.add("Mariona");
		persones.add("Josep");
		persones.add("Pep");
		persones.add("Teresa");
		
		System.out.println("- "+persones);
		
		
		TreeSet <Article> articles = new TreeSet <Article>();
		
		Article art = new Article(12, "art num 1");
		articles.add(art);
		Article art1 = new Article(1, "art num 2");
		articles.add(art1);
		Article art2 = new Article(7, "art num 3");
		articles.add(art2);
		Article art3 = new Article(21, "art num 4");
		articles.add(art3);
		Article art4 = new Article(18, "art num 5");
		articles.add(art4);
		
		for(Article arti : articles) {
			System.out.println("- "+arti.getCodi()+" "+arti.getDescripcio());
		}
		System.out.println("---------------------------------------------------");
/**		
		Article comparadorArticle = new Article();
		
		TreeSet<Article> articles2 = new TreeSet <Article>(comparadorArticle);
		
		articles2.add(art);
		articles2.add(art1);
		articles2.add(art2);
		articles2.add(art3);
		articles2.add(art4);
		
		for(Article arti : articles2) {
			System.out.println("- "+arti.getCodi()+" "+arti.getDescripcio());
		}
	
**/
		
		
		//ComparadorArticles compara_art = new ComparadorArticles();
		TreeSet<Article> articles2 = new TreeSet <Article>(new Comparator<Article>() {
			public int compare(Article o1, Article o2) {
				String descA=o1.getDescripcio();
				String descB=o2.getDescripcio();
				
				return descA.compareTo(descB);
			}

		});
		
		articles2.add(art);
		articles2.add(art1);
		articles2.add(art2);
		articles2.add(art3);
		articles2.add(art4);
		
		for(Article arti : articles2) {
			System.out.println("- "+arti.getCodi()+" "+arti.getDescripcio());
		}
		
		
	}

		
	
	
	
}

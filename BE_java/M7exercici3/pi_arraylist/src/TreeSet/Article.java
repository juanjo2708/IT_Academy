package TreeSet;

import java.util.Comparator;

public class Article implements Comparable <Article>{ //, Comparator<Article>{
	private int codi;
	private String descripcio;
	
	public Article() {
		
	}
	
	public Article(int codi,String descripcio) {
		this.codi=codi;
		this.descripcio=descripcio;
	}
	
	
	
	/**
	 * @return the codi
	 */
	public int getCodi() {
		return codi;
	}



	/**
	 * @param codi the codi to set
	 */
	public void setCodi(int codi) {
		this.codi = codi;
	}



	/**
	 * @return the descripcio
	 */
	public String getDescripcio() {
		return descripcio;
	}



	/**
	 * @param descripcio the descripcio to set
	 */
	public void setDescripcio(String descripcio) {
		this.descripcio = descripcio;
	}



	@Override
	public int compareTo(Article o) {
		return codi- o.getCodi();
		
	}

	

/**
	@Override
	public int compare(Article o1, Article o2) {
		String descA=o1.getDescripcio();
		String descB=o2.getDescripcio();
		
		return descA.compareTo(descB);
	
	}
**/
	
	
}

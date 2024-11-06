package ej;

public abstract class Bloc {
	
	protected int longueur, largeur, hauteur;
	
	public Bloc(final int longueur, final int largeur, final int hauteur){
		this.longueur = longueur;
		this.largeur = largeur;
		this.hauteur = hauteur;
		
	}
	
	public int getLongueur() {
		return this.longueur;
	}
	
	public int getLargeur() {
		return this.largeur;
	}
	
	public int getHauteur() {
		return this.hauteur;
	}
}

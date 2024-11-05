package ej;

public class Bloc {
	private int longueur, largeur, hauteur;
	
	Bloc(final int longueur, final int largeur, int hauteur){
		this.hauteur = hauteur;
		this.largeur = largeur;
		this.longueur = longueur;
	}
	
	public int getlongueur() {
		return this.longueur;
	}
	
	public int getlargeur() {
		return this.largeur;
	}
	
	public int gethauteur() {
		return this.hauteur;
	}
}

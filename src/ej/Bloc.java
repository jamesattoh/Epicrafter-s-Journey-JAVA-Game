package ej;

public abstract class Bloc implements IBloc { //implements is to outsource everything about couleur 
	
	protected int longueur, largeur, hauteur;
	protected Couleur couleur;
	
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
	
	public void setCouleur(Couleur couleur) { // (Couleur couleur) : dependencies injection to reduce coupling
		this.couleur = couleur;
	}
}

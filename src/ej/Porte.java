package ej;


public class Porte extends Bloc {
	
	private boolean verrouille;
	
	public Porte(final int longueur, final int largeur, final int hauteur, final boolean verrouille){
		super(longueur, largeur, hauteur); //call the parent class constructor 
		this.verrouille = verrouille;
		this.couleur = Couleur.BLEU;
	}
	
	public boolean estVerrouilee() {
		
		return verrouille;
	}
}

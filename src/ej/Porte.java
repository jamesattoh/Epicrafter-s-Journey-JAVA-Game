package ej;


public class Porte extends Bloc {
	
	private boolean verrouille;
	
	public Porte(final int longueur, final int largeur, final int hauteur, final boolean verrouille) 
			
			throws IllegalBlocException {
		
		super(longueur, largeur, hauteur); //call the parent class constructor 
		this.verrouille = verrouille;
		this.couleur = Couleur.BLEU;
	}
	
	public boolean estVerrouilee() {
		
		return verrouille;
	}
	
	public void verrouiller() throws PorteVerrouilleException {
		if(verrouille == false) {
			verrouille = true;
		}else {
			throw new PorteVerrouilleException();
		}
	}
}

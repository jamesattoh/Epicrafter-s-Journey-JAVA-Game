package ej.blocs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ej.IllegalBlocException;
import ej.PorteVerrouilleException;

public class Porte extends Bloc {
	
	private static Logger logger = LogManager.getLogger(Porte.class);
	
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
		if(verrouille) {
		
			logger.error("La porte ne peut pas être verrouillée car c'est déjà le cas.");
			throw new PorteVerrouilleException();
			
		}else {
			verrouille = true;
		}
	}
}

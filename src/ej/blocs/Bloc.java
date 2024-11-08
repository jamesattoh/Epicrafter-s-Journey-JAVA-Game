package ej.blocs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ej.IllegalBlocException;

public abstract class Bloc implements IBloc { //implements is to outsource everything about couleur 
	
	private Logger logger = LogManager.getLogger(Bloc.class);
	
	protected int longueur, largeur, hauteur;
	protected Couleur couleur;
	
	public Bloc(final int longueur, final int largeur, final int hauteur) throws IllegalBlocException {
		
		if(longueur < MIN_LONGUEUR || largeur < MIN_LARGEUR || hauteur < MIN_HAUTEUR) {
			
			logger.error("Les valeurs minimales pour la longueur, la lagrgeur et la hauteur n'ont pas été respectées.");
			
			throw new IllegalBlocException();
		}
		
		this.longueur = longueur;
		this.largeur = largeur;
		this.hauteur = hauteur;
		
		logger.info("Un bloc de type " + this.getClass().getSimpleName() + " a été construit.");
				
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

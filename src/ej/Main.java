package ej;


import ej.blocs.Porte;

public class Main {
    
	
    public static void main(String[] args) {
        
    	
        
    	try {
	    		Porte porte = new Porte(1,2,3,true);
	            porte.verrouiller();
	            
    	}catch (IllegalBlocException exc) {
    		
            System.out.println("Impossible de construire le bloc");

    	} catch(PorteVerrouilleException Exception) {
    		
            System.out.println("Porte déjà verrouiller");

    	}
        
    }
    
}
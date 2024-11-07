package ej;

public class Main {
    
    public static void main(String[] args) {
        //Kit kitDeDemarrage = new Kit();
        //kitDeDemarrage.afficherKit();
        
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
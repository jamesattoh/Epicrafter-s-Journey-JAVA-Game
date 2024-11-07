/** package ej;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    
    public static void main(String[] args) {
        Map<Bloc, Integer> quantiteBloc= new HashMap<Bloc, Integer>();
        quantiteBloc.put(new Mur(1,1,1,true), 4);
        quantiteBloc.put(new Porte(1,1,1,false), 4);
        
        Set<Bloc> cles = quantiteBloc.keySet();
        for(Bloc bloc : cles) {
            Integer valeur = quantiteBloc.get(bloc);
            System.out.println(bloc.getClass().getName() + " : " + valeur);
        }
    }
    
}
**/

package ej;

public class Main {
    
    public static void main(String[] args) {
        Kit kitDeDemarrage = new Kit();
        kitDeDemarrage.afficherKit();
    }
    
}
package ex1;

import java.util.*;

public class Ville extends zoneTouristique {
	List<zoneTouristique> ensemble = new ArrayList<zoneTouristique>();
	public void addZone(zoneTouristique z) {
		ensemble.add(z);
	}
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		System.out.println("la ville a accepté votre visiteur");
		v.visitVille(this);
		for(zoneTouristique z : ensemble) {
			z.accept(v);
		}
	}

}

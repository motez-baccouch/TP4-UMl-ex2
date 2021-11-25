package ex2;

import java.util.*;

public class Sujet {
List<Observateur> obs= new ArrayList<>();
public void ajouter(Observateur o) {
	obs.add(o);
}
public void supprimer(Observateur o){
obs.remove(o);
}
public  void notifier() {
	
};
}

package ex2;

public class PorteGarage extends Sujet {
	
private State state;
public PorteGarage() {
	state= new ferme();
}
public PorteGarage(State initial){
	state=initial;
}
public void changeState(State s) {
state=s;	
this.notifier();
}
public void fermer() {
state.setPorteGarage(this);
state.fermer();	
}

public void ouvrir() {
state.setPorteGarage(this);
state.ouvrir();	
}
public String getState() {
return state.toString();	
}
public void notifier() {
	for(Observateur o : obs)
	o.MiseAJour(state.toString());
}
}

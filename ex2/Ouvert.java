package ex2;

public class Ouvert implements State {
	private PorteGarage p;
	public void setPorteGarage(PorteGarage p) {
	this.p=p;	
	}
	public void fermer() {
	System.out.println("en fermeture");
	 p.changeState(new enFermeture());}
	public void ouvrir() {
		System.out.println("deja ouvert");
	};
	public String toString() {
		return "ouvert";
	}
}

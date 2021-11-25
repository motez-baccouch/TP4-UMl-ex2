package ex2;

public class ferme implements State {
	private PorteGarage p;
	public void setPorteGarage(PorteGarage p) {
	this.p=p;	
	}
	public void fermer() {
		System.out.println("deja ferme");
	}
	public void ouvrir() {
		System.out.println("en ouverture");
		p.changeState(new enOuverture());
	};
	public String toString() {
		return "ferme";
	}
}

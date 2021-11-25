package ex2;

public class enFermeture implements State {
	private PorteGarage p;
	public void setPorteGarage(PorteGarage p) {
	this.p=p;	
	}
	@Override
	public void fermer() {
		// TODO Auto-generated method stub
		System.out.println("Porte Fermer");
	}

	@Override
	public void ouvrir() {
		// TODO Auto-generated method stub
		System.out.println("Fermeture annulé , porte en ouverture");
		p.changeState(new enOuverture());
	}
	public String toString() {
		return "enFermeture";
	}
}

package ex2;

public class enOuverture implements State {
	private PorteGarage p;
	public void setPorteGarage(PorteGarage p) {
	this.p=p;	
	}
	@Override
	public void fermer() {
		// TODO Auto-generated method stub
		System.out.println("ouverture annulé , en fermeture");
		p.changeState(new enFermeture());
	}

	@Override
	public void ouvrir() {
		// TODO Auto-generated method stub
	System.out.println("Porte ouvert");	
	p.changeState(new Ouvert());
	}
	public String toString() {
		return "enOuverture";
	}
}

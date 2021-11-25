package ex2;

public class Client {
	public static void main(String[] args) {
	PorteGarage p = new PorteGarage();
	Ecran e = new Ecran();
	p.ajouter(e);
	p.fermer();
	p.ouvrir();
	p.fermer();
	p.fermer();
	p.ouvrir();
	p.ouvrir();
	}
}

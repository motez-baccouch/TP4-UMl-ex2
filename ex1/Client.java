package ex1;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VisiteurAcheterSouvenir as = new VisiteurAcheterSouvenir();
		VisiteurVisiterPourLaPremiereFois cp = new VisiteurVisiterPourLaPremiereFois();
		Ville guarma = new Ville();
		Muse bardo = new Muse();
		Parc Park = new Parc();
		
		guarma.accept(cp);
		guarma.accept(as);
		bardo.accept(cp);
		Park.accept(cp);
		guarma.addZone(Park);
		guarma.accept(cp);
	}

}

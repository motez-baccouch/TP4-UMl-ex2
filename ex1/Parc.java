package ex1;

public class Parc extends zoneTouristique {

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		System.out.println("le parc a accept� votre visite");
		v.visitParc(this);
	}

}

package ex1;

public class Muse extends zoneTouristique {

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		System.out.println("le musé a accepté votre visite");
		v.visitMuse(this);
	}

}

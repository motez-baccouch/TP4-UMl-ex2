package ex1;

public class VisiteurVisiterPourLaPremiereFois extends Visitor {

	@Override
	public void visitVille(Ville v) {
		// TODO Auto-generated method stub
		System.out.println("Ville visité pour la premiere fois");
	}

	@Override
	public void visitMuse(Muse m) {
		// TODO Auto-generated method stub
		System.out.println("Muse visité pour la premiere fois");
	}

	@Override
	public void visitParc(Parc p) {
		// TODO Auto-generated method stub
		System.out.println("Parc visité pour la premiere fois");
	}

}

package ex1;

public class VisiteurAcheterSouvenir extends Visitor {

	@Override
	public void visitVille(Ville v) {
		// TODO Auto-generated method stub
		System.out.println("Souvenir achet� de ville");
	}

	@Override
	public void visitMuse(Muse m) {
		// TODO Auto-generated method stub
		System.out.println("Souvenir achet� de muse");
	}

	@Override
	public void visitParc(Parc p) {
		// TODO Auto-generated method stub
		System.out.println("Souvenir achet� de Parc");
	}

}

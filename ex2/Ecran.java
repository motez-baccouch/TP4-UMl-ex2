package ex2;

public class Ecran implements Observateur {

	@Override
	public void MiseAJour(String state) {
		// TODO Auto-generated method stub
		System.out.println(" ----------------------------------");
		System.out.println("| NEW NOTIFICATION                ");
		System.out.println("| new state is : "+state+"       ");
		System.out.println(" ----------------------------------");
	}

}

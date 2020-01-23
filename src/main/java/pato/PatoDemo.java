package pato;

public class PatoDemo {

	public static void main(String[] args) {
		System.out.println("Pato demo!");
		Pato patoSelvagem = new PatoSelvagem();
		Pato patoUrbano = new PatoUrbano();
		
		System.out.println("Aciona pato Selvagem:");
		acionaPato(patoSelvagem);
		
		System.out.println("Aciona pato Urbano:");
		acionaPato(patoUrbano);
	}
	
	public static void acionaPato(Pato pato) {
		pato.grasnar();
		pato.voar();
	}

}


/**
 * Classe qui contient l'application
 * @author Youssouf Oumar & Sarah Habbi
 *
 */
public class GymnaseApp {
	/**
	 * 
	 * @param args : paramètre du main, on en utilise pas à ce stade
	 */
	public static void main(String[] args) {
		
		System.out.println("\nBienvenue au Gymnase de Jussieu !\n");
		Gymnase gymnase = new Gymnase();
		Club boxe = new Boxe(10);
		Club judo = new Judo(30);
		Club danse = new Danse(20);
		gymnase.ajouterClub(boxe);
		gymnase.ajouterClub(judo);
		gymnase.ajouterClub(danse);		
		gymnase.afficherMenuPrincipal();

	}
}

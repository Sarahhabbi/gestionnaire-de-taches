import java.util.Scanner;

/**
 * Classe pour gérer les membres du Gymnase
 * @author Youssouf Oumar & Sarah Habbi<br/>
 * 
 */

public class Membre extends Etudiant{
	String club;
	/**
	 * 
	 * @param nom 
	 * 		nom du membre
	 * @param prenom 
	 * 		prenom du membre
	 * @param identifiant
	 * 		identifiant du membre
	 * @param club
	 * 		nom du club auquel l'instance courante est inscrite
	 */
	public Membre(String nom, String prenom, String identifiant, String club) {
		super(nom, prenom, identifiant);
		this.club = club;
	}
	
	/**
	 * Affiche le nom et prenom du membre
	 */
	public String toString(){
		return 
			 super.getNom() + " "+ super.getPrenom();
	}
	/**
	 * Créer une nouvelle instance de Membre et la retourne.
	 * @return un nouveau membre
	 * en récupérant les informations nécessaires depuis la console 
	 * @throws InvalidIdentifiantException  si l'identifiant est incorrecte
	 * @throws ClubInexistantException si le club démandé n'existe pas
	 */
	public static Membre creerMembre() throws InvalidIdentifiantException, ClubInexistantException {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nVeuillez saisir votre nom :");
		String nom = sc.nextLine();
		
		System.out.print("Veuillez saisir votre prenom :");
		String prenom = sc.nextLine();
		
		System.out.print("Veuillez saisir le nom du club souhaité :");
		String club = sc.nextLine();
		if (!club.equals("Boxe") && !club.equals("Judo") && !club.equals("Danse")) {
			throw new ClubInexistantException("\nVeillez saisir un nom de club correct !\nVous pouvez aller dans la section 2 pour connaitre les clubs proposés au gymnase !");
		}
		System.out.print("Veuillez saisir votre identifiant :");
		String identifiant = sc.nextLine();
		verifieIdentifiant(identifiant);
		
		Membre membre = new Membre(nom, prenom, identifiant, club);

		return membre;
	}
	/**
	 * Retourne le nom du club auquel le membre appartient
	 * @return le nom du club auquel l'objet instance appartient
	 */
	public String getClub() {

		return club;
	}

}

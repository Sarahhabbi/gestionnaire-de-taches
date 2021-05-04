import java.util.ArrayList;

/**
 * Classe abstraite et héritée par Boxe, Judo et Danse
 * @author Youssouf Oumar & Sarah Habbi 
 * 
 */
public abstract class Club  {
	protected String nom;
	protected ArrayList<Membre> membres = new ArrayList<Membre>();

	/**
	 * Constructueur Club 
	 * @param str 
	 * nom du club
	 */
	public Club(String str) {
		nom = str;
	}
	
	/**
	 * Retourne l'attribut membre correspondant à la liste des membres du club.
	 * 
	 * @return membres : liste des membres du club
	 */
	public ArrayList<Membre> getMembres(){
		return membres;
	}
	
	/**
	 * Affiche l'ensemble des membres du club
	 * 
	 */
	public void afficherMembres() {
		if (membres.size()==0) {
			System.out.println("\nOups, personne n'est encore inscrit au club de " + nom);
		}
		else {
			System.out.println("\nVoici l'ensemble des membres du club de "  + nom + " :\n" );
			for (Membre membre : membres ) {
				System.out.println(membre.toString());
			}	
		}
		
	}
	/**
	 * Retourne le nom du club
	 * 
	 * @return nom 
	 * 		nom du club
	 */
	public String getNom() {
		return nom;
	}
	
	/**
	 * Inscrit un nouveau membre dans un club.
	 * 
	 * @param membre 
	 * 		une instance de la classe Membre
	 * @throws ClubPleinException si jamais le club de Boxe est plein.<br/>
	 * */
	public abstract void inscrireMembreClub(Membre m) throws ClubPleinException;
	
}

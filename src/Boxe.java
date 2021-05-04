/**
 * Classe pour gérer le club de Boxe
 * @author Youssouf Oumar <br/>
 *
 */

public class Boxe extends Club {
	private int nbMembresMax;
	private static int nbMembreInscrit = 0;
	
	/**
	 * Constructeur de Boxe, initialise le nom à "Boxe" et fixe sa capacité d'acceuil.
	 * @param nbMembresMax 
	 * capacité d'accueil du club de Boxe<br/>
	 */
	public Boxe(int nbMembresMax) {
		super("Boxe");
		this.nbMembresMax = nbMembresMax;
	}
	/**
 	* Retourne les statistiques du club de Boxe.
 	* @return nbMembreInscrit et nbMembresMax.
 	*/
	public String toString() {
		return "\nVoici les statistiques du club de Boxe  :\nNombres d'inscrits  :" + nbMembreInscrit+ "\nCapacité d'accueil : "+ nbMembresMax; 
		
	}
	
	/**
	 * Inscrit un nouveau membre au club de Boxe en ajoutant dans la liste des membres.
	 * 
	 * @param membre 
	 * 		une instance de la classe Membre
	 * @throws ClubPleinException si jamais le club de Boxe est plein.<br/>
	 * */
	@Override
	public void inscrireMembreClub(Membre membre) throws ClubPleinException {
		if (nbMembreInscrit >= nbMembresMax) {
			throw new ClubPleinException("Le club Boxe ne peut pas accueillir de nouveau membre.");
		}
		else {
			membres.add(membre);
			nbMembreInscrit++; 
			System.out.println("\n" + membre.getNom() +" " + membre.getPrenom() + " d'identifiant " + membre.getIdentifiant() + " est désormais membre du club de Boxe");
		}
	}
	
	/**
	 *Retourne un entier correspondant à la capacité d'accueil du club de Boxe
	 *
	 * @return l'attribut nbMembresMax
	 */
	public int getNbMembresMax() {
		return nbMembresMax;
	}
	

}
	
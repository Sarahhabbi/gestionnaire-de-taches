/**
 * Classe pour gérer le club de Judo
 * @author Habbi Sarah<br/>
 *  
 */

public class Judo extends Club {
	private int nbMembresMax;
	private static int nbMembreInscrit = 0;
	/**
	 * Constructeur de Judo qui initialise le nom du club à "Judo" et fixe sa capacité d'accueil.<br/>
	 * @param nbMembresMax
	 * capacité d'acceuil du club de Judo
	 */
	public Judo(int nbMembresMax) {
		super("Judo");
		this.nbMembresMax = nbMembresMax;
	}
	
	/**
 	* Retourne les statistiques du club de Judo.
 	* @return nbMembreInscrit et nbMembresMax.
 	*/
	@Override
	public String toString() {
		return "\nVoici les statistiques du club de Judo  : \nNombres d'inscrits  :" + nbMembreInscrit+ "\nCapacité d'accueil : "+ nbMembresMax; 
	}
	
	/**
	 * Inscrit un nouveau membre au club de Judo
	 * 
	 * @param membre : une instance de Membre
	 * nouveau membre à inscrire au club de Judo
	 * 
	 * @throws ClubPleinException si jamais le club de Judo est plein.
	 * */
	@Override
	public void inscrireMembreClub(Membre membre) throws ClubPleinException {
		if (nbMembreInscrit >= nbMembresMax) {
			throw new ClubPleinException("Le club Boxe ne peut pas accueillir de nouveau membre.");
		}
		else {
			membres.add(membre);
			nbMembreInscrit++; 
			System.out.println("\n" + membre.getNom() +" " + membre.getPrenom() + " d'identifiant " + membre.getIdentifiant() + " est désormais membre du club de Judo");
		}
	}
	
	/**
	 * Retourne la capacité maximale du club de Judo
	 * @return nbMembresMax 
	 * 		capacité d'accueil du club de Judo
	 */
	public int getNbMembresMax() {
		return nbMembresMax;
	}
	

}
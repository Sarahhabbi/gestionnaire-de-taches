/**
 * Classe pour gérer le club de Danse
 * @author Habbi Sarah <br/>
 *
 */

public class Danse extends Club {
	private int nbMembresMax;
	private static int nbMembreInscrit = 0;
	
	/**
	 * Constructeur du club de Danse, initialise le nom à "Danse" et fixe sa capacité d'acceuil.
	 *
	 * @param nbMembresMax : la capacité d'accueil du club
	 */
	public Danse(int nbMembresMax) {
		super("Danse");
		this.nbMembresMax = nbMembresMax;
	}
	/**
 	* Retourne les statistiques du club de Danse.
 	* @return nbMembreInscrit et nbMembresMax.
 	*/
	public String toString() {
		return "\nVoici les statistiques du club de Judo  :\nNombres d'inscrits  :" + nbMembreInscrit+ "\nCapacité d'accueil : "+ nbMembresMax; 
	}
	
	/**
	 * Inscrit un nouveau membre au club de Danse
	 * 
	 * @param membre : une instance de Membre
	 * nouveau membre à inscrire au club de Danse
	 * 
	 * @throws ClubPleinException si jamais le club de Danse est plein.
	 * */
	@Override
	public void inscrireMembreClub(Membre membre) throws ClubPleinException {
		if (nbMembreInscrit >= nbMembresMax) {
			throw new ClubPleinException("Le club de Danse ne peut pas accueillir de nouveau membre.");
		}
		else {
			membres.add(membre);
			nbMembreInscrit++; 
			System.out.println("\n" + membre.getNom() +" " + membre.getPrenom() + " d'identifiant " + membre.getIdentifiant() + " est désormais membre du club de Danse");
		}
	}
	
	/**
	 *Retourne un entier correspondant à la capacité d'accueil du club de Danse.
	 * @return l'attribut nbMembresMax
	 * 
	 * */
	public int getNbMembresMax() {
		return nbMembresMax;
	}
	

}
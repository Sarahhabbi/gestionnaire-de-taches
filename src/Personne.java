
/**
 * Classe pour gérer l'objet Personne
 * @author Youssouf Oumar & Sarah Habbi<br/>
 *
 */
public class Personne {
	private String nom;
	private String prenom;
	
	/**
	 * Constructueur de Personne, affecte les attributs nom et prenom.
	 * @param nom
	 * nom de la personne
	 * @param prenom 
	 * prenom de la personne
	 */
	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	/**
	* Retourne les attributs nom et prenom de l'instance courante.
 	*@return Retourne les attributs nom et prenom.
 	*/
	@Override
	public String toString() {
		return nom + " " + prenom; 
	}
	
	/**
	 * Retourne l'attribut nom
	 * @return Retourne l'attribut nom.
	 */
	public String getNom() {
		return nom;
	}
	
	/**
	 * Change l'attribut nom de l'instance courante.
	 * @param nom
	 * Le nouveau nom de l'instance courante.
	 * 
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/**
	 * Retourne l'attribut prenom.
	 * @return Retourne l'attribut prenom.
	 */
	public String getPrenom() {
		return prenom;
	}
	
	/**
	 * Change l'attribut prenom avec le paramètre passé en argument.
	 * @param prenom
	 * Le nouveau prenom de l'instance courante.
	 * 
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
}

/**
 * Classe pour gérer le concept Etudiant
 * @author Youssouf Oumar 
 *  
 */
public class Etudiant extends Personne {
	private String identifiant;
	
	/**
	 * 
	 * @param nom
	 * nom de l'étudiant
	 * @param prenom 
	 * prenom de l'étudiant
	 * @param identifiant
	 * identifiant de l'étudiant
	 */
	public Etudiant(String nom, String prenom, String identifiant) {
		super(nom, prenom);
		this.identifiant = identifiant;
	}
	
	
	/**
	 * Vérifie que l'identifiant donné en argument est un numéro d'étudiant. 
	 * @param identifiant 
	 * Identifiant à vérifier
	 * @throws InvalidIdentifiantException si jamais l'identifiant saisi n'est pas de 8 chiffres et ne commence pas par 286 <br/>
	 * */
	public static void verifieIdentifiant(String identifiant) throws InvalidIdentifiantException{
		if (identifiant.length()!=8 || !identifiant.startsWith("286")) {
			throw new InvalidIdentifiantException("\nCet identifiant n'est pas valide, si vous ne le connaissez pas, demandez le au secretariat");
		}
		try {
			Integer.parseInt(identifiant);
		} catch (NumberFormatException e) {
			throw new InvalidIdentifiantException("\nCet identifiant n'est pas valide, si vous ne le connaissez pas, demandez le au secretariat");
		} 
	}
	
	/**
	 * Retourne les attributs d'un étudiant (nom, prenom, identifiant).
	 */
	@Override
	public String toString() {
		return super.toString() + " " + identifiant;
	}
	
	/**
	 * Retourne l'identifiant (numéro étudiant) de l'instance courante.
	 * @return  identifiant
	 */
	public String getIdentifiant() {
		return identifiant;
	}
	
	
	

}

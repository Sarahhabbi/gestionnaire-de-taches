/**
 * Classe gérant une exception lancée lorsque l'on essaie d'inscrire un membre dont l'identifiant étudiant est incorrect
 * @author Youssouf Oumar
 */
public class InvalidIdentifiantException extends Exception {
	
	/**
	 *
	 * @param string
	 * 		pour initialiser le message de l'exception 
	 */
	InvalidIdentifiantException(String string) {
		super(string);
	}

}

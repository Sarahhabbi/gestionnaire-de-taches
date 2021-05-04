/**
 * Classe gérant une exception lorsque l'on essaie d'inscrire un membre dans un club inexistant dans le gymnase.
 * @author Habbi Sarah 
 * 
 */
public class ClubInexistantException extends Exception {
	/**
	 * 
	 * @param string
	 * 		pour initialiser le message de l'exception 
	 */
	public ClubInexistantException(String string) {
		super(string);
	}
	
}

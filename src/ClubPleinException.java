/**
 * Classe gérant une exception lancée lorsque l'on essaie d'inscrire un membre dans un club qui a atteint sa capacité d'acceuil
 * @author Youssouf Oumar <br/>
 *
 */
public class ClubPleinException extends Exception {
	/**
	 * 
	 * @param string
	 * 		pour initialiser le message de l'exception 
	 */
	public ClubPleinException(String string) {
		super(string);
	}
	
}

/**
 * Interface fixant les fonctionnalités que la classe Gymnase devra implémenter
 * @author Youssouf Oumar <br/>
 * 
 *
 */
public interface Administration {
	public void afficherClubs();
	public void afficherClubMembres(String nomClub);
	public void afficherClubInformations(String nomClub);
	public void inscrireMembreGymnase();
}

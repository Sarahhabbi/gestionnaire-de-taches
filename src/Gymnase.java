/**
 * Classe gérant toutes les tâches liées au Gymnase
 * 
 * @author Youssouf Oumar & Sarah Habbi 
 * 
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Gymnase implements Administration{
	
	private ArrayList<Club> clubs;

	/**
	 * Constructeur Gymnase
	 * 
	 */
	public Gymnase() {
		clubs = new ArrayList<Club>();
	}
	
	/**
	 * Affiche le menu principal avec les différentes fonctionnalités du programme.
	 */
	public void afficherMenuPrincipal(){
    	Scanner sc = new Scanner(System.in);
		System.out.println("\nMenu principal : \n");
        System.out.println("1. Enregistrer un nouveau membre"); 
        System.out.println("2. Afficher l'ensemble des clubs ");
	    System.out.println("3. Afficher les informations d'un club");
        System.out.println("4. Afficher les membres d'un club ");
        System.out.print("\nVeuillez saisir le numéro correspondant à votre choix : ");
        int choix = -1;
        String choixstr = sc.nextLine();

        try{
            choix = Integer.parseInt(choixstr); 		
        }
        
        catch(NumberFormatException e){
        	System.out.println("\nVeillez saisir un numéro correct !");
        }
        
        switch(choix){ 	
        
            case 1:
                inscrireMembreGymnase(); 		
            break;
            
            case 2:
                afficherClubs();
                afficherMenuPrincipal();
                break;
                
            case 3:
            	System.out.print("\nEntrez le nom du club dont vous souhaitez afficher les informations:");
            	String club = sc.nextLine();
                if (club.equals("Boxe") || club.equals("Judo") || club.equals("Danse") ) {
                	afficherClubInformations(club);
                } else {
                	System.out.println("\nVeillez saisir un nom de club correct !");
                }
                afficherMenuPrincipal();
                break;
                
            case 4:
            	System.out.print("\nEntrez le nom du club dont vous souhaitez afficher les membres:");
            	club = sc.nextLine();
            	if (club.equals("Boxe") || club.equals("Judo") || club.equals("Danse") ) {
                	afficherClubMembres(club);
                } else {
                	System.out.println("\nVeillez saisir un nom de club correct !");
                }
                afficherMenuPrincipal();
                break;
                
            default:
            	System.out.println("\nVeillez saisir un numéro correct !");
            	afficherMenuPrincipal();
            	break;
        }
    }
	
	/**
	 * Permet d'inscrire un nouveau membre au Gymnase, dans un club spécifique.
	 */
	public void inscrireMembreGymnase() {
		
		Membre membre;
		
		try {
			membre = Membre.creerMembre();
		} catch (InvalidIdentifiantException e) {
			System.out.println(e.getMessage());
			afficherMenuPrincipal();
			return;
		} catch (ClubInexistantException e) {
			System.out.println(e.getMessage());
			afficherMenuPrincipal();
			return;
		}
		String club = membre.getClub();
		
		
	
		try {
			Club c = trouveClub(club);
			c.inscrireMembreClub(membre);
			afficherMenuPrincipal();
			
		}catch (ClubPleinException e) {
			System.out.println(e.getMessage());
			afficherMenuPrincipal();
		}
		
	}
	
	/**
	 * Ajoute le club passé en paramètre à la liste de clubs du gymnase.
	 * @param c
	 * 		une instance de Club 
	 *  
	 */
	
	public void ajouterClub(Club c) {
		clubs.add(c);
	}
	
	/**
	 * Affiche dans la console les différents clubs proposés au gymnase.
	 */
	public void afficherClubs() {
		System.out.println("\nVoici l'ensemble des clubs existants au Gymnase : Boxe, Judo, et Danse");
	
	}
	
	/**
	 * Retourne l'instance du club demandé en paramètre.
	 * @return l'instance d'un club ou null s'il n'existe pas dans le gymnase.
	 * @param nomClub
	 * 		nom d'un club
	 */
	public Club trouveClub(String nomClub){
		for (int i = 0; i < clubs.size(); i++) {
			if(clubs.get(i).getNom().equals(nomClub)) {
				return clubs.get(i);
			}
		}
		return null;
	}
	
	/**
	 * Affiche les membres du club dont le nom est passé en argument.
	 * @param nomClub
	 * nom d'un club
	 * 
	 */
	public void afficherClubMembres(String nomClub){
		for (Club club : clubs) {
			if (club.getNom().equals(nomClub)){
				club.afficherMembres();
				return;
			}
		}
	}
	
	/**
	 * Affiche les informations d'un club dont le nom est passé en argument ou rien s'il n'existe pas.
	 * @param nomClub
	 * 		nom d'un club 
	 * 
	 */
	public void afficherClubInformations(String nomClub) {
		for (Club club : clubs) {
			if (club.getNom().equals(nomClub)){
				System.out.println(club.toString());
				return;
			}
		}
	}
		
	    
} 

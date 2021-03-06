package diane.jeu;
import java.util.Scanner;

public class Jeu3 {
	static Scanner clavier = new Scanner(System.in);

	public static void main(String[] args) {
		
		String name1;
		String name2;
		String act1;
		String act2;
		int tour = 1;
		
		Player player1 = new Player("Player 1", 50.0, 2.5);
		Player player2 = new Player("Player 2", 40.0, 4.0);
		System.out.println("Bienvenue " + player1.getName() + " et " + player2.getName() + "\n"
				+ player1.getName() + ", quel est votre nom ?");

		name1 = clavier.nextLine();
		player1.setName(name1);
		
		System.out.println("Bonjour " + player1.getName() + "\n"
				+ player2.getName() + ", quel est votre nom ?");
		
		name2 = clavier.nextLine();
		player2.setName(name2);
		
		
		System.out.println("Bonjour, " + player1.getName() + " et " + player2.getName() + ". \n"
				+ "Les dégâts dépendent du joueur. Tour " + tour );
			
			while (player1.getHealth()>0 && player2.getHealth()>0) {
			
				
				System.out.println(player1.getName() + ", voulez vous \"attaquer\" ou \"parer\" ?");
				act1 = clavier.nextLine();
				System.out.println(player2.getName() + ", voulez vous \"attaquer\" ou \"parer\" ?");
				act2 = clavier.nextLine();
			
			if (!act1.equals("attaquer") && !act1.equals("parer") || !act2.equals("attaquer") && !act2.equals("parer")) {
				System.out.println("Faute de frappe, tour annulé !");
			} else {
					if (act1.equals("attaquer") && act2.equals("attaquer")) {
						player2.damage(player1.getAttack());
						player1.damage(player2.getAttack());

						System.out.println("Les deux joueurs attaquent ! \n"
								+ player1.getName() + " subit " + player2.getAttack() + " points de dégâts ! Il lui reste " + player1.getHealth() + " points de vie. \n"
								+ player2.getName() + " subit " + player1.getAttack() + " points de dégâts ! Il lui reste " + player2.getHealth() + " points de vie.");
				
					}
					if (act1.equals("parer") && act2.equals("attaquer")) {
						player1.hide(player2.getAttack() / 2);
						System.out.println(player1.getName() + " se défend de l'attaque de " + player2.getName() + "!\n"
								+ player1.getName() + " subit " + player2.getAttack()/2 + " points de dégâts ! Il lui reste " + player1.getHealth() + " points de vie !");
					}
					if (act1.equals("attaquer") && act2.equals("parer")) {
						player2.hide(player1.getAttack() / 2);
						System.out.println(player2.getName() + " se défend de l'attaque de " + player1.getName() + "!\n"
								+ player2.getName() + " subit " + player1.getAttack()/2 + " points de dégâts ! Il lui reste " + player2.getHealth() + " points de vie !");
					}
					if (act1.equals("parer") && act2.equals("parer")) {
						System.out.println("Rien ne se passe !");
					}
					
					
			}
				
				
			
				tour++;
				System.out.println("Tour " + tour);
			
	}	
			System.out.println("Le jeu est fini !");
			}}
				
		

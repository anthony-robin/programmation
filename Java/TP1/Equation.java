import java.util.Scanner;

public class Equation{

	public static void main(String[] args){
		
		// Décalration de variables
		int rejouer      = 0;
		double a         = 0;
		double b         = 0;
		double c         = 0;
		double delta     = 0;
		double solution1 = 0;
		double solution2 = 0;
		
		
		System.out.println("Bonjour, bienvenue dans ce cours de Maths, nous allons ensemble tenter de résoudre une équation de type ax² + bx + c. Ready ?");
		
		// Boucle principale (pour rejouer)
		do{

			System.out.print("Veuillez saisir une valeur pour a: ");
			a = Lecture.lireInt();

			System.out.print("Veuillez saisir une valeur pour b: ");
			b = Lecture.lireInt();

			System.out.print("Veuillez saisir une valeur pour c: ");
			c = Lecture.lireInt();

			// Visualisation de l'équation que l'on va tenter de résoudre
			System.out.println("L'équation qui l'on va tenter de résoudre est donc la suivante: " + a+"x² + " + b+"x + " + c);
			
			
			delta = (b*b) - 4*a*c;
			System.out.println(delta);

			// Si delta inférieur à 0
			if(delta < 0){
				System.out.println("Il n'y a aucune solution pour cette équation :(");
				System.out.print("Voulez-vous rejouer ? (1 pour oui) ");
				rejouer = Lecture.lireInt();
			}
			else{

				// Si delta supérieur à 0
				if(delta > 0){

					// Si a vaut 0 l'opération va planter
					if(a == 0){
						System.out.println("Cette équation n'est pas du second degrès");
					}
					else{
						solution1 = (-b - Math.sqrt(delta)) / (2*a);
						solution2 = (-b + Math.sqrt(delta)) / (2*a);
						System.out.println("Cette équation possède 2 solutions: " + solution1 + " et " + solution2);
						
					}
					System.out.print("Voulez-vous rejouer ? (1 pour oui) ");
					rejouer = Lecture.lireInt();
				
				}

				// Si delta vaut 0
				else{

					if(a == 0){
						System.out.println("Cette équation n'est pas du second degrès");
					}
					else{
						solution1 = -b / (2*a);
						System.out.println("L'unique solution de l'équation est " + solution1);
					}
					
					System.out.print("Voulez-vous rejouer ? (1 pour oui) ");
					rejouer = Lecture.lireInt();

				}
			}



		} while(rejouer == 1);

		System.out.println("Merci d'avoir joué, à bientôt");

		
	} // fin de la méthode main

} // fin de la classe Equation
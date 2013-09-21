import java.util.Scanner;

public class Moyenne{

	public static void main(String[] args){

		// Déclaration de variables
		int nbvaleurs = 0;
		double nombre = 0;
		double notes = 0;
		double moyenne = 0;

		System.out.print("Bonjour, combien de valeurs souhaitez-vous saisir ? ");
		nbvaleurs = Lecture.lireInt();

		for(int i=1; i<=nbvaleurs; i++){
			do{
				System.out.print("Note " + i + " (entre 0 et 20): ");
				nombre = Lecture.lireInt();
			} while(nombre < 0 || nombre > 20);

			notes += nombre;
			// System.out.println(notes + " :: " + nombre);
		}

		moyenne = notes / nbvaleurs;
		System.out.println("La moyenne des notes saisies est " + moyenne);


	} // fin de la méthode void


} // fin de la classe Moyenne
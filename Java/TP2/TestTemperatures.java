public class TestTemperatures{

	private double[] tab;

	public TestTemperatures(){

		int nombreTemperature = 0;

		do{
			System.out.print("Combien de valeurs souhaitez-vous saisir ? ");
			nombreTemperature = Lecture.lireInt();
		} while( nombreTemperature <= 0);
		
		tab = new double[nombreTemperature];

		for (int j=0; j<nombreTemperature; j++) {
			System.out.print("Veuillez saisir une température s'il vous plaît: ");
			double temperature = Lecture.lireDouble();
			tab[j] = temperature;
		}
	}
	
	public TestTemperatures(double[] tab){

	}
	
	public static void main(String[] args){
		TestTemperatures premiereInstanceDeTemperature = new TestTemperatures();
		System.out.println(premiereInstanceDeTemperature);
	} // fin de la méthode main


	public String toString(){
		String retour = "Températures: ";
		for (int i=0; i<tab.length; i++) {
			retour += "["+tab[i]+"]";
		}
		return retour;
	}


} // fin de la classe TestTemperatures
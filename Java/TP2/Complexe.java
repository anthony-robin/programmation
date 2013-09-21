public class Complexe{


	/*
	|-------------------------------------------------
	| Attributs
	|-------------------------------------------------
	|
	*/
	private double x, y;


	/*
	|-------------------------------------------------
	| Constructeur
	|-------------------------------------------------
	|
	*/
	public Complexe(){
		this(0, 0);
	}

	public Complexe(double x, double y){
		this.x = x;
		this.y = y;
	}

	public Complexe(Complexe c){
		this(c.getX(), c.getY());
	}


	public static void main(String[] args){
		Complexe complexe1 = new Complexe(10, -25);
		// complexe1.setX(10);
		// complexe1.setY(-25);

		Complexe complexe2 = new Complexe(8, 3);

		complexe1.multiplication(complexe2);
		System.out.println(complexe1);
		

		// complexe1.addition(complexe1, complexe2);
		// System.out.println("Addition: " + complexe1);

		// complexe1.ajout(complexe2);
		// System.out.println(complexe1);

		
		// complexe1.oppose();
		// System.out.println(complexe1);

		// complexe1.norme();
		// System.out.println(complexe1);

	} // fin de la méthode main


	public String toString(){
		return "c = " + x + (y>=0 ? " + " : " ") + y + "i";
	}


	public void oppose(){
		x = -x;
		y = -y;
	}


	public void ajout(Complexe c){
		this.x += c.x;
		this.y += c.y;
	}

	public void multiplication(Complexe c){
		double tmp = this.x;
		this.x = (this.x*c.x - this.y*c.y);
		this.y = (tmp*c.y + c.x*this.y);
	}


	public void norme(){
		double norme = Math.sqrt(x*x + y*y);
		if(norme == 0){
			return;
		}
		x /= norme;
		y /= norme;
	}


	public void addition(Complexe c1, Complexe c2){
		this.x = c1.x + c2.x;
		this.y = c1.y + c2.y;
	}




	/*
	|-------------------------------------------------
	| Getter / Setter
	|-------------------------------------------------
	|
	*/
	public double getX(){
		return x;
	}

	public double getY(){
		return y;
	}

	public void setX(double valeurX){
		x = valeurX;
	}

	public void setY(double valeurY){
		y = valeurY;
	}


} // fin de la classe Complexe
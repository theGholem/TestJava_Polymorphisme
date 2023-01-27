package fr.Application1.gui;

public class Pnj4 extends Pnj {

	//Constructeur
	
	public Pnj4() {
			this.name="Passant";
	}
		
	public String Pnj_skyColor() {
			return "Noir";
	}
		
	public String Pnj_role() {
			String rst=this.name+" : "+" Marche tous simplement en boucle";
			return rst;
	}
		
	public String Particularity() {
			String rst="Il ne fait rien d'autres que marcher";
			return rst;
	}
		
	public int old() {
			return 56;
	}
}

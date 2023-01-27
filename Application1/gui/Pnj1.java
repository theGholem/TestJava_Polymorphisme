package fr.Application1.gui;

public class Pnj1 extends Pnj implements MagicWandable {

	//Constructeur
	
	public Pnj1() {
		this.name="Bucherons";
	}
	
	public String Pnj_skyColor() {
		return "Noir";
	}
	
	public String Pnj_role() {
		String rst=this.name+" : "+" Salut tous les personnages passant par la foret";
		return rst;
	}
	
	public String Particularity() {
		String rst="Tiens toujour une hache dans sa main droite lorsqu'il salut les joueurs";
		return rst;
	}
	
	public int old() {
		return 46;
	}
	
	/*
	 * pnj qui possede une baguette magique issu de l'interface 
	 * MagicWandable
	 */
	
	public void MagicWand() {
		System.out.println(this.name+" cache dans sa poche arriere une baguette magique");
	}
}

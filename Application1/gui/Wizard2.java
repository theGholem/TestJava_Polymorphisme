package fr.Application1.gui;

public class Wizard2 extends Wizard implements MagicWandable {

	//Constructeur
	
	public Wizard2() {
			this.name="EMRIS";
	}
		
	public int Wizard_level() {
			return 16;
	}
		
	public String Wizard_power() {
			String rst=this.name+" : "+" detenteur du pouvoir du phoenix";
			return rst;
	}
		
	public int old() {
			return 100;
	}
	
	/*
	 * magicien qui ne peut pas voler, ni booster son niveau mais a 
	 * une baguette magic(issu de nos du 2eme interfaces"MagicWandable")
	 */
	
	public void MagicWand() {
		System.out.println(this.name+" possede une baguette magique et rien d'autres");
	}
}

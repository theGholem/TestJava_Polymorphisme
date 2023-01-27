package fr.Application1.gui;

public class Wizard1 extends Wizard implements BoostFlyable,MagicWandable  {

	//Constructeur
	
	public Wizard1() {
		this.name="MERLIN";
	}
	
	public int Wizard_level() {
		return 17;
	}
	
	public String Wizard_power() {
		String rst=this.name+" : "+" detenteur du pouvoir des dragons";
		return rst;
	}
	
	public int old() {
		return 180;
	}
	
	/*
	 * magicien qui peut voler, booster son niveau et avoir 
	 * une baguette magic(issu de nos 2 interfaces a la fois)
	 */
	
	public void fly() {
		System.out.println(this.name+" est capable de voler");
	}
	
	public void booster() {
		System.out.println(this.name+ " a vu son niveau augmenté et il vaut maintenant : "+2*Wizard_level());
		
		// 2*17
	}
	
	public void MagicWand() {
		System.out.println(this.name+" a une baguette magic pour ces sorts");
	}
}

package fr.Application1.gui;

public class Bandit3 extends Bandits implements BoostFlyable {

	//Constructeur
	
	public Bandit3() {
			this.name="MUZAN KIBUTSUJI";
	}
		
	public int Bandits_level() {
			return 100;
	}
		
	public String Bandits_power() {
			String rst=this.name+" : "+" Pouvoir moleculaire";
			return rst;
	}
		
	public int old() {
			return 1000;
	}
	
	/*
	 * Bandit qui peut voler et qui a un booster(issu de notre interface
	 * BoostFlyable)
	 */
	
	public void fly() {
		System.out.println(this.name+" S'en vole à coup sur.");
	}
	public void booster() {
		System.out.println(this.name+ " a vu son niveau augmenté et il vaut maintenant : "+2*Bandits_level());
		
		//2*100
	}
}

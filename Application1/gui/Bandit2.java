package fr.Application1.gui;

public class Bandit2 extends Bandits implements BoostFlyable {
	
	//Constructeur
	
	public Bandit2() {
			this.name="AKAZA";
	}
		
	public int Bandits_level() {
			return 16;
	}
		
	public String Bandits_power() {
			String rst=this.name+" : "+" Pouvoir du sang";
			return rst;
	}
		
	public int old() {
			return 190;
	}
	
	/*
	 * Bandit qui peut voler et qui a un booster(issu de notre interface
	 * BoostFlyable)
	 */
	
	public void fly() {
		System.out.println(this.name+" est capable de s'en voler");
	}
	public void booster() {
		System.out.println(this.name+ " a vu son niveau augmenté et il vaut maintenant : "+2*Bandits_level());
		
		//2*16
	}
}

package fr.Application2.gui;

public class Id extends Propriety { 

	
	public Id(String name,int old) {
		this.name=name;
		this.old=old;
	}
	
	public void getName() {
		System.out.println("Nom : "+this.name);
	}
	
	public void getOld() {
		System.out.println("Age : "+this.old);
	}
	
	/*
	 * Le password correspond à l'association du pseudo et l'age du USER
	 */
	
	public void getPassword() {
		System.out.println("Le password correspondant à "+this.name+ " est : " +this.name+"@"+this.old);
	}
	
}

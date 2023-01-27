package fr.Application2.gui;

/*
 * Programme qui genere un simple password a partir du prenom et de l'age de l'utilisateur
 */

import java.util.Scanner;

import java.io.InputStreamReader;
import java.io.BufferedReader;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestId {

	public static void main(String[] args) throws Exception {
		
		Scanner sc=new Scanner(System.in);
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		Id p1,p2,p3,p4,p5;
		
		ArrayList<Id> group=new ArrayList<Id>(10);
		
		System.out.println("__1er personne__ \nPseudo et age respectivement svp: ");
		String n1=br.readLine();
		int o1=sc.nextInt();
		System.out.println("__2eme personne__ \nPseudo et age respectivement svp: ");
		String n2=br.readLine();
		int o2=sc.nextInt();
		System.out.println("__3eme personne__ \nPseudo et age respectivement svp: ");
		String n3=br.readLine();
		int o3=sc.nextInt();
		System.out.println("__4eme personne__ \nPseudo et age respectivement svp: ");
		String n4=br.readLine();
		int o4=sc.nextInt();
		System.out.println("__5eme personne__ \nPseudo et age respectivement svp: ");
		String n5=br.readLine();
		int o5=sc.nextInt();
		
		//instanciation ditrect 
		
		group.add(new Id(n1,o1));
		group.add(new Id(n2,o2));
		group.add(new Id(n3,o3));
		group.add(new Id(n4,o4));
		group.add(new Id(n5,o5));
		
		ListIterator<Id> lI=group.listIterator();
		while(lI.hasNext())
			lI.next().getPassword();
		
		
		
		

	}

}

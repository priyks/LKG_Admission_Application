package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class LKG_Admission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList <Pupil> p=new ArrayList<Pupil>();
		char  mydiv;
		int intake = 5;
		int id;
		
		for (int i = 0; i < intake; i++) {
			
			System.out.println("Enter Student Name ..");
			String name=sc.nextLine();
			System.out.println("Enter Student age...");
			int age=sc.nextInt();
			Pupil child=new Pupil(name, age);
			if(child.isEligible())
			{
			System.out.println("Assign unique id to pupil..");
			id=sc.nextInt();
			child.setPno(id);
			System.out.println("Please Enter any A,B,C,D one char from it...!");
		    mydiv=sc.next().charAt(0);
		    
		    if(mydiv=='A' || mydiv=='B' || mydiv=='C' || mydiv=='D') {
		    	child.assign_Div(mydiv);
		    	child.serve_Meal();
				 
			 }else {
				 System.out.println("You Entered Wrong division...!");
			     continue;
			 }
			p.add(child);
			}
			 sc.nextLine();
			System.out.println(p.toString());
		}
		System.out.println("              Pupil Details                  ");
		 for(Pupil obj: p ) {
			obj.details_of_pupil();
		} 
		
		/* Iterator myitr=p.iterator();
		
		while(myitr.hasNext()){
			
			System.out.println(myitr.next());
			
		} */
		

	}

}

package com;

import java.util.Scanner;

interface AdmissionProcedure{
	
	public static final String school_name="Shri Shivaji Vidyalaya, Beed.";
	
	public  void serve_Meal(); 
	public   boolean isEligible();
	public void addmission();
	public void assign_Div(char ch);
}
public class Pupil implements AdmissionProcedure {
	
	private int pno;
	private String name;
	private int age;
	private boolean flag=false;
	private char mydiv;
	
	public Pupil(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override	
	public  void serve_Meal() {
			
			System.out.println("Meal is being served..by "+school_name);
		}

	@Override
	public boolean isEligible() {
		
		if(age<=8 && age>=2) {
			
			System.out.println("Congratulation..! "+name+" Eligible for Addmission...");
			flag=true;
		}
		else {
			System.out.println("Not Eligible for addmisstion..!");
			flag=false;
		}
		if(flag==true)
		{
			 this.addmission();
			 this.assign_Div(mydiv);
			 System.out.println("Addmisstion process is completed successfully....!");
			 System.out.println("Your Most Welcome In Our School : "+name+ " You are in LKG "+mydiv); 
		}
		
		
		return flag;
	}

	public char getMydiv() {
		return mydiv;
	}

	public void setMydiv(char mydiv) {
		this.mydiv = mydiv;
	}

	@Override
	public void addmission() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assign_Div(char ch) {
		// TODO Auto-generated method stub
		this.setMydiv(ch);
		
	}

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Pupil [pno=" + pno + ", name=" + name + ", age=" + age + ", mydiv=" + mydiv + "]";
	}
	
	public void details_of_pupil() {
		
		System.out.println(".............................................");
		System.out.println("Id :" +this.pno);
		System.out.println("Name : "+this.name);
		System.out.println("Age :"+age);
		System.out.println("Div :"+this.mydiv);
		System.out.println(".............................................");
	
	}
}

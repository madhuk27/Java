package com.training.mars;
	
public class Person {
	int height, weight;  //hei, wei are instance variables
	static String species;; //spec is static variable
	Person(int h, int w){
	this.height = h;
	this.weight = w;
	}
	void run() {
		for (int i =1; i<4; i++) {  //i is a local variable
			System.out.println("Run Run");
		}
	}
	void print() {
		System.out.println("My height is " + this.height);
	}
	public static void main(String[] args) {
		Person person = new Person(170, 65);
		person.run();
		person.print();
		Person.species = "Human";
	}
}
package assignment_phase1;
	class Animal 
	{
	 void eat()
	 {
	  System.out.println("I am a omnivorous!! ");
	 }
	}

	class Mammal extends Animal 
	{
	 void nature()
	 {
	  System.out.println("I am a mammal!! ");
	 }
	}

	class Dog extends Mammal 
	{
	 void sound()
	 {
	  System.out.println("I bark!! ");
	 }
	}

	class Inheritance 
	{
	 public static void main(String args[])
	 {
	  Dog d = new Dog();
	  d.eat();
	  d.nature();
	  d.sound();
	 }
	}
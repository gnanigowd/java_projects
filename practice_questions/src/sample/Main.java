package sample;

public class Main {
	void walk() {
		System.out.println("animals is walking");
		
	}
class Dog extends Main{
	void walk() {
		System.out.println("dog  is walking");
		
	}
	public  void main(String[]args) {
		Main m= new Dog();
		m.walk();
		
	}
}
	

}

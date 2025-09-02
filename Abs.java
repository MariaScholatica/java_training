// 1st abstraction method with no body but implemented by child classes
//2nd method for abstraction : normal method with body which define inside the abstraction class
abstract class Animal{
    //no body for abstract class
    abstract void sound();
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("Meow Meow");
    }
}
public class Abs
{
	public static void main(String[] args) {
		Animal a1=new Dog();
		a1.sound();
		
		Animal a2=new Cat();
		a2.sound();
	}
}
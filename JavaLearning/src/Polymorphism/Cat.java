package Polymorphism;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    public void cry(){
        System.out.println("Cat cry() 🐱在叫");
    }
}

package Polymorphism;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void cry(){
        System.out.println("Dog cry() 🐶在叫");
    }
}

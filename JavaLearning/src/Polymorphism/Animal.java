package Polymorphism;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void cry(){
        System.out.println("Animal cry() 动物在叫");
    }
}

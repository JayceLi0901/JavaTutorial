package Polymorphism;



// 1. 一个对象的编译类型和运行类型可以不一致（运行类型需要等于编译类型或者是编译类型的子类）
// 2. 编译类型在定义对象时就已经确定下来，不能改变，而运行类型是可以变化的。（编译类型在 = 左边，运行在 = 右边）
public class Main {
    public static void main(String[] args) {
        Master master = new Master("Jayce");
        Dog dog = new Dog("Dog");
        Bone bone = new Bone("Bone");
        Cat cat = new Cat("Cat");
        Fish fish = new Fish("Fish");

        master.feed(dog, bone);
        master.feed(cat, fish);

    }
}

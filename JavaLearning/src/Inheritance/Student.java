package Inheritance;

public class Student  {
    public String name;
    public int age;
    private double score;
    private int id;

    public void setScore(double score) {
        this.score = score;
    }

    public void showInfo(){
        System.out.println("name is " + name + ", age is " + age + ", score is " + score);
    }
}

// 1. 私有属性和方法不能在子类直接访问，要通过公共的方法去访问（public，默认，protected都可以访问）
// 2. 子类必须调用父类的构造器，完成父类的初始化。如果父类没有无参构造器，
//    则必须在子类的构造器中用super去指定使用父类的哪个构造器，从而完成对父类的初始化工作，否则就会报错。
// 3. 如果希望指定调用父类的某个构造器，则显式调用一下（super（构造器的参数））。同时在使用super时，需要放在子类构造器第一行。
// 4. super和this不能共存，都要在构造器的第一行。
// 5. java所有类都是Object的子类，所以父类构造器的调用不止于父类，可以一直追溯到Object类。
// 6. Java中是单继承模式，最多只能继承一个父类。如果A想要继承B和C两个类，则需要B继承C，A继承B的形式来完成。
// 7. 如果有多层继承关系，如果初始化了一个最底层的类的时候，调用了一个属性 name，那么我们需要看这个子类有没有这个属性。
//    如果有且能直接访问，则返回信息。如果没有，则一层一层往上找，直到Object


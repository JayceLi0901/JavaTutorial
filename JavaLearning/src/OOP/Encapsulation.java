package OOP;

// 封装(encapsulation)就是把抽象出的数据[属性]和对数据的操作[方法]封装在一起,数
// 据被保护在内部,程序的其它部分只有通过被授权的操作[方法],才能对数据进行操作。
public class Encapsulation{
    public String name;
    public int age;
    public double salary;

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

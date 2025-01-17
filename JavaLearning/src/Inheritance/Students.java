package Inheritance;

public class Students extends Person{
    private int id;
    private double score;

    public Students(int age, String name, int id, double score) {
        super(age, name);
        this.id = id;
        this.score = score;
    }

    public void Say(){
        System.out.println("我是"+super.getName()+", "+super.getAge()+"岁， 我的id是"+id+", 我的成绩是"+score);
    }
}

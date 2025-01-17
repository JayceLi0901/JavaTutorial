package Inheritance;

public class Inheritance01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "Pupil";
        pupil.age = 18;
        pupil.testing();
        pupil.setScore(85);
        pupil.showInfo();

        System.out.println("==========================®");

        Graduate graduate = new Graduate();
        graduate.name = "Graduate";
        graduate.age = 22;
        graduate.testing();
        graduate.setScore(99);
        graduate.showInfo();
    }
}

package Inheritance;

public class Test{
    public static void main(String[] args) {
//        PC pc = new PC();
//        NotePad notePad = new NotePad();
//
//        pc.setBrand("苹果");
//        pc.CPU= "M1 Max";
//        pc.Memory = "32GB";
//        pc.Hardware = "1TB";
//        notePad.setColor("银色");
//        notePad.CPU= "A16";
//        notePad.Memory = "16GB";
//        notePad.Hardware = "256GB";
//
//        System.out.println("==========PC属性==========");
//        pc.getDetails();
//        System.out.println("==========NotePad属性==========");
//        notePad.getDetails();

        Person p = new Person(26,"Jayce");
        Students s = new Students(25,"Grace",3, 99.2);

        p.Say();
        s.Say();
    }
}

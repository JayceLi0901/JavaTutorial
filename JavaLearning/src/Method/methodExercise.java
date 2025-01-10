package Method;

import java.util.Random;
import java.util.Scanner;

public class methodExercise {
    public static void main(String[] args) {

        //A01
        double[] x = {1.2, 1.4, 51.5, 124.5, 235.1};
        A01 a01 = new A01();
        a01.max(x);

        //Circle
        Circles circle = new Circles(1.1);
        double perimeter = circle.showPerimeter();
        double area = circle.showArea();
        System.out.println(perimeter + " " + area);

        //print several areas
        CircleA c = new CircleA();
        PassObject passObject = new PassObject();
        System.out.println("Radius\tArea");
        passObject.printAreas(c,5);

        //rock paper scissor
        RPS rps = new RPS();
        int[] resArr = rps.reuslt();
        System.out.println("您赢了" + resArr[0] + "次，输了" + resArr[1] + "次");
    }
}

class A01{
    public void max(double[] a){
        double max = Double.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println(max);
    }
}

class Circles{
    double radius;

    public Circles(double radius){
        this.radius = radius;
    }

    public double showPerimeter(){
        double perimeter = this.radius * 2 * Math.PI;
        return perimeter;
    }

    public double showArea(){
        double area = this.radius * this.radius * Math.PI;
        return area;
    }
}

class CircleA{
    double radius;

    public double findArea(){
        double area = this.radius * this.radius * Math.PI;
        return area;
    }
}

class PassObject{

    public void printAreas(CircleA c, int times){
        for(int i=1;i<=times;i++){
            c.radius = i;
            System.out.println(c.radius + "\t\t" + c.findArea());
        }

    }
}

class RPS{
    int win = 0;
    int loss = 0;
    boolean keepPlaying = true;

    public int[] reuslt(){

        while(keepPlaying){
            Random random = new Random();
            int comInput = random.nextInt(2);

            Scanner sc = new Scanner(System.in);
            System.out.println("请输入 0 1 2 或 -1:");
            int input= Integer.parseInt(sc.nextLine());

            if(input == -1){
                keepPlaying = false;
                System.out.println("您已退出游戏");
            }
            //平局
            else if(input==comInput){
                System.out.println("电脑出"+comInput);
                System.out.println("平局");
                System.out.println("==========================================");
            }
            // 人赢
            else if((comInput==0 && input==2) || input==comInput-1){
                win += 1;
                System.out.println("电脑出"+comInput);
                System.out.println("这是你第"+win+"次获胜");
                System.out.println("==========================================");
            }
            //电脑赢
            else if((comInput==2 && input==0) || input==comInput+1){
                loss += 1;
                System.out.println("电脑出"+comInput);
                System.out.println("这是你第"+loss+"次失败");
                System.out.println("==========================================");
            }
        }
        int[] resArray = {win, loss};
        return resArray;
    }
}
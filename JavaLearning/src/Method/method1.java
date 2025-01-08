package Method;

// 当声明了一个新的对象a后，如果再声明一个对象b=a后，该赋值为深拷贝操作
// 访问修饰符的作用是控制方法使用的范围
// 方法重构的时候可以使用可变参数 例如public void method1(int... nums)代表了可以传入多个int参数，并且nums可以被作为
// 数组使用，遍历元素的话就用数组的遍历形式就行。
// 构造器没有返回值，名字跟类名一致，直接把属性作为构造器的形参
// this.name = name, this.age = age, this代指当前对象
public class method1 {
    public static void main(String[] args) {
        Member member = new Member();
        member.speak();
        member.cal01();
        member.cal02(5);
        int a = member.getSum(10,20);
        System.out.println(a);

        int[][] twoDArray = {{1,2},{3,4},{5,6}};
        member.MyTools(twoDArray);

        Person person = new Person();
        person.name = "abcabc";
        person.age = 18;

        Person clonePerson = member.clonePerson(person);
        System.out.println(clonePerson.name);
        System.out.println(clonePerson.age);

        int fibo = member.fibonacci(7);
        System.out.println(fibo);

        int peachNum = member.peach(1);
        System.out.println(peachNum);
    }
}

class Member{
    String speak;
    int age;

    public void speak(){
        System.out.println("我是一个好人");
    }

    public void cal01(){
        int sum = 0;
        for(int i = 1; i <= 1000; i++){
            sum += i;
        }
        System.out.println(sum);
    }

    public void cal02(int a){
        int sum = 0;
        for(int i = 1; i <= a; i++){
            sum += i;
        }
        System.out.println(sum);
    }

    public int getSum(int a, int b){
        int res = a + b;
        return res;
    }

    public void MyTools(int[][] x){
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
    }

    public Person clonePerson(Person p){
        Person clone = new Person();
        clone.age = p.age;
        clone.name = p.name;
        return clone;
    }

    public int fibonacci(int n){
        if(n == 1 || n == 2){
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public int peach(int n){
        if(n==10){
            return 1;
        } else if (n>=1 && n<10){
            return (peach(n + 1) + 1) * 2 ;
        } else {
            return -1;
        }
    }

}

class Person{
    String name;
    int age;
}
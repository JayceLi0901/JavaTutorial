package Method;

//当声明了一个新的对象a后，如果再声明一个对象b=a后，该赋值为深拷贝操作
public class method1 {
    public static void main(String[] args) {
        Member member = new Member();
        member.speak();
        member.cal01();
        member.cal02(5);
        int a = member.getSum(10,20);
        System.out.println(a);
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

}


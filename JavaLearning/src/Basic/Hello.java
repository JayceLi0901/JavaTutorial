/*
    Hello是一个类,是一个public的类
    一个源文件中最多只能有一个public类别，其他类的个数不限
    main方法可以放在非public类当中执行
*/
/*
    \t 制表符
    \n 换行符
    \\ 一个\
    \" 一个“
    \' 一个'
    \r 一个回车, 回车不代表换行，同一行中会将\r后面的内容放至最前方，同时执行insert功能
 */
// javadoc -d 文件夹名 -xx -yy 文件名.java 该代码可以将java文件编译成文档
// 文档中具体的标签需要上网查询相应的信息
package Basic;

public class Hello {
    public static void main(String[] args) {

        System.out.println("\t北研中心Java学习进度");
        System.out.println("\n北研中心Java学习进度");
        System.out.println("\\北研中心Java学习进度");
        System.out.println("\"北研中心Java学习进度");
        System.out.println("\'北研中心Java学习进度");
        System.out.println("北研中心\rJava学习进度");
    }
}

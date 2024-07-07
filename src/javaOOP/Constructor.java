package javaOOP;
class Student{
    String name;
    int age;
    public  void printinfo()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
}
public class Constructor {
    public static void main(String[] args) {
        Student s1=new Student("swapno",22);
        s1.printinfo();
    }
}

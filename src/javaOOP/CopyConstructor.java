package javaOOP;
class Student1{
    String name;
    int age;
    public void printage()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student1()
    {

    }
    Student1(Student1 st)
    {
        this.name=st.name;
        this.age=st.age;
    }
}
public class CopyConstructor {
    public static void main(String[] args) {
        Student1 st=new Student1();
        st.name="Swapno";
        st.age=22;
        Student1 st1=new Student1(st);
        st1.printage();

    }
}

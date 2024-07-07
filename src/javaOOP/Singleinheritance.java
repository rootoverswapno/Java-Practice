package javaOOP;
class One{
    public void print1()
    {
        System.out.print("Swapnomoy ");
    }
}
class Two extends One{
    public void print2()
    {
        System.out.print(" Biswas");
    }
}
class Three extends Two{
    public void print3()
    {
        System.out.println(" Polash");
    }
}
public class Singleinheritance {
    public static void main(String[] args) {
        Three obj=new Three();
        obj.print1();
        obj.print2();
        obj.print3();
    }
}

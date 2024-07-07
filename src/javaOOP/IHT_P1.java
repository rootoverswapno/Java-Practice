package javaOOP;
 class Animal{
public void makesound()
{
    System.out.println("thi animal make sound");
}
}
class Cat extends Animal{
     public void makesound()
     {
         System.out.println("the cat is brown");
     }
}
public class IHT_P1 {
    public static void main(String[] args) {
        Animal ani=new Animal();
        Cat cat=new Cat();
        ani.makesound();
        cat.makesound();
    }
}

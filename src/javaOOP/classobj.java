package javaOOP;
class pen{
    String coloor;
    String type;
    public void write()
    {
        System.out.println("Writeing something");
    }
    public void printcolor()
    {
        System.out.println(this.coloor);
    }
    public void setType()
    {
        System.out.println(this.type);
    }
}
public class classobj {
    public static void main(String[] args) {
      pen pen1=new pen();
      pen1.coloor="Blue";
      pen1.type="gel";
      pen pen2=new pen();
      pen2.coloor="Red";
      pen2.type="bbl";
      pen1.printcolor();
      pen2.printcolor();
      pen1.setType();
      pen2.setType();
    }
}

package JavaThreading;

public class thread {
    public static void main(String[] args) {
      Thread t=Thread.currentThread();
        System.out.println("Current thread "+t);
        //change thread name
        t.setName("My thread");
        System.out.println("After name change "+t);
        for(int i=10;i>=0;--i)
        {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

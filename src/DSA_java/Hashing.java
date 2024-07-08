package DSA_java;

import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String[] args) {
        HashSet<Integer>set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println("Size of set is "+set.size());
        if(set.contains(1))
        {
            System.out.println("Present");
        }
        if(!set.contains(6))
        {
            System.out.println("Absent");
        }
        set.remove(1);
        System.out.println(set);
        set.add(9);
        Iterator it=set.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next()+" ");
        }

    }
}

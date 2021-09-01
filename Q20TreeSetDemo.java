import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.io.*;

public class Q20TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<Integer> tSet = new TreeSet<Integer>();
          tSet.add(35);
            tSet.add(17);
              tSet.add(100);
        tSet.add(27);
        tSet.add(13);
        tSet.add(9);
        tSet.add(15);
        tSet.add(10);

        System.out.println("TreeSet contains: " + tSet);

        /*
         * To get the a reverse order view of this TreeSet, use
         * the descendingSet method
         */
        Set<Integer> reverseSet = tSet.descendingSet();

        //get an iterator
        Iterator<Integer> itr = reverseSet.iterator();

        System.out.println("Reverse set contains: ");
        while(itr.hasNext()){
            System.out.println( itr.next() );
        }
    }
}

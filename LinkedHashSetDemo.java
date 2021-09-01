import java.util.*;
import java.util.LinkedHashSet;
import java.io.*;
class LinkedHashSetDemo
{
 public static void main(String args[]){
 //Creating HashSet and adding elements
        LinkedHashSet<String> set=new LinkedHashSet<String>();
               set.add("Arunima");
               set.add("keerthana");
               set.add("gouri");
               set.add("ammu");
               set.add("ann");
               Iterator<String> i=set.iterator();
               while(i.hasNext())
               {
               System.out.println(i.next());
               }
               System.out.println("Size of LinkedHashSet = " +set.size());
 }
}

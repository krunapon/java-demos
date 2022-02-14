package coe.java.demos.c7;
//Purpose: Contrast library LinkedList with the manual solutions.
//The link management infrastructure is completely hidden.
//Author : Fred Swartz, 21 Feb 2006, placed in the public domain.

import java.util.*;

public class LibraryLinkedList {
    public static void main(String[] args) { 
    	// Create object 'in' to read from
    	// whatever the user types
        Scanner in = new Scanner(System.in);
        // Create the linkedlist to store words
        // that the user types
        LinkedList<String> lst = new LinkedList<String>();
        //... Read and build list of words.
        // Run until the user type Ctrl-D
        while (in.hasNext()) {
            String word = in.next();
            lst.add(word);
        }
        //... Enhanced for loop to print list forward.
        //    Could also use an Iterator (forward only) or
        //    ListIterator (forward or backward).
        System.out.println("*** Print words in order of entry");
        // for each element 's' in the list 'lst'
        for (int i = 0; i < lst.size(); i++) {
        		System.out.println(lst.get(i));
        }
        for (String s : lst) {
            System.out.println(s);
        }
       
        //... Use ListIterator go to backward.  Start at end.
        System.out.println("*** Print words in reverse order of entry");
        for (ListIterator<String> lit = lst.listIterator(lst.size()); 
        			lit.hasPrevious();) {
            System.out.println(lit.previous());
        }
        Object[] s = lst.toArray();
        Arrays.sort(s);
        for (int i = 0; i < s.length; i++) {
        	System.out.print(s[i]);
        }
    }
}

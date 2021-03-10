import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> al = new LinkedList<>();
        for(int i =0; i<n;i++){
            al.add(sc.nextInt());
        }
        int q = sc.nextInt();
        for(int j=0; j<q; j++){
            String s = sc.next();
            if(s.equals("Insert")){ //Insert
                al.add(sc.nextInt(), sc.nextInt());
            }else{ // Delete
                al.remove(sc.nextInt());
            }  
        }
        sc.close();   // sc object should be closed before printing output
        for (int num : al)  
            System.out.print(num + " "); 
    } 
}
/*
Use a LinkedList instead of an ArrayList when adding/removing items often since it will be faster (ArrayList often needs to shift O(n) elements after an add or remove, which is slow).
*/

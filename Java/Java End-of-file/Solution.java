import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);              
        int count = 0;
        while(sc.hasNext()){
            String s = ""; 
            s = s + sc.nextLine();
            count +=1;
            String ss = Integer.toString(count);
            System.out.println(ss + " "+s);   
        }  
    }
}
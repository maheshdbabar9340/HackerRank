import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        BigInteger b1 = sc.nextBigInteger(); 
        BigInteger b2 = sc.nextBigInteger(); 
        System.out.println(b1.add(b2));
        System.out.println(b1.multiply(b2));        
    }
}

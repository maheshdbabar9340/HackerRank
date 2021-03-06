import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
      BigInteger n = scanner.nextBigInteger();
      scanner.close();
      System.out.println(n.isProbablePrime(1) ? "prime" :"not prime");
    }
}
/*
We can use 1,3,5,100 etc in isProbablePrime(1), which is know as certainity

Visit this site - https://www.tutorialspoint.com/java/math/biginteger_isprobableprime.htm to know more about certainity.
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<ArrayList<Integer>> table = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int d = in.nextInt();
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                row.add(in.nextInt());
            }
            table.add(row);
        }
        
        int queries = in.nextInt();
        for (int i = 0; i < queries; i++) {
            int lineNumber = in.nextInt();
            int position = in.nextInt();
            try {
                System.out.println(table.get(lineNumber - 1).get(position - 1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
    }
}
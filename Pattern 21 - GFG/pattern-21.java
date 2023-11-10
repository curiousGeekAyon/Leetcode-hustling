//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            obj.printSquare(n);
        }
    }
}
// } Driver Code Ends


class Solution {
    void printSquare(int N) {
    if (N != 1) {
            for (int i = 0; i < N; i++) {
                System.out.print('*');
            }
            System.out.println();

            for (int i = 0; i < N - 2; i++) {
                System.out.print('*');
                for (int j = 0; j < N - 2; j++) {
                    System.out.print(' ');
                }
                System.out.println('*');
            }

            for (int i = 0; i < N; i++) {
                System.out.print('*');
            }
            System.out.println();
        } 
        else {
            System.out.println('*');
        }
    }
 
}
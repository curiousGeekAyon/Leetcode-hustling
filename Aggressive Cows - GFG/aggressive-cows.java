//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {

            int n;
            n = sc.nextInt();

            int k;
            k = sc.nextInt();

            int[] v = new int[n];
            for (int i = 0; i < n; i++) v[i] = sc.nextInt();

            Solution obj = new Solution();
            int res = obj.solve(n, k, v);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public static int solve(int n, int k, int[] stalls) {
        Arrays.sort(stalls);
        int low=1;
        int high=stalls[n-1]-stalls[0];
        int ans=-1;
        while(low<=high)
             {
                 int mid=low+((high-low)/2);
                 boolean check=isPossible(n,k,mid,stalls);
                 if(check)
                   {
                      ans=mid;
                      low=mid+1;
                   }
                  else{
                         high=mid-1;
                       }
             }
        return ans;
    }
  public static boolean isPossible(int n,int k,int val,int[]stalls)
        {
                int start=0;
                int end=1;
                int count=1;
                while(end<n)
                     {
                         int diff=(stalls[end]-stalls[start]);
                         if(diff>=val)
                            {
                               count++;
                               start=end;
                               end++;
                               if(count==k)
                                 {
                                     return true;
                                 }
                            }
                        else{
                               end++;
                        }
                     }
               
                     
                if(count>=k)
                   {
                       return true;
                   }
                else{
                       return false;
                }
        }
}
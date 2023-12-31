//{ Driver Code Starts
import java.util.*;

class Count
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int m = sc.nextInt();
            int n = sc.nextInt();
            
            int arr1[] = new int[m];
            int arr2[] = new int[n];
            
            for(int i = 0; i < m; i++)
              arr1[i] = sc.nextInt();
              
            for(int i = 0; i < n; i++)
              arr2[i] = sc.nextInt();
              
            Solution gfg = new Solution();
            ArrayList<Integer> res = gfg.countEleLessThanOrEqual(arr1, arr2, m, n);
            for (int i = 0; i < res.size(); i++)
                System.out.print (res.get (i) + " ");
            System.out.println();
        }
        
    }
}
// } Driver Code Ends


// Complete the function given below
class Solution
{
    public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n)
    {
           Arrays.sort(arr2);
           ArrayList<Integer>list=new ArrayList<>();
           for(int i=0;i<m;i++)
               {
                   int res=findCount(arr2,n,arr1[i])+1;
                   list.add(res);
               }
           return list;
    }
    public static int findCount(int []arr2,int n,int target)
          {
              int high=n-1;
              int low=0;
              int res=-1;
              while(low<=high)
                   {
                       int mid=low+((high-low)/2);
                       if(arr2[mid]==target)
                          {
                              res=mid;
                              break;
                          }
                       else if(arr2[mid]<target)
                         {
                             res=mid;
                             low=mid+1;
                         }
                       else{
                               high=mid-1;
                       }
                   }
                   
             low=0;
             high=n-1;
             
             if(res==-1)
                {
                    return res;
                }
             if(arr2[res]==target)
                {
                    
                    while(low<=high)
                        {
                            int mid=low+((high-low)/2);
                            if(arr2[mid]==target)
                               {
                                   res=mid;
                                   low=mid+1;
                               }
                             else if(arr2[mid]>target)
                                    {
                                        high=mid-1;
                                    }
                             else{
                                  low=mid+1;
                             }
                        }
                }
            return res;
          }
}
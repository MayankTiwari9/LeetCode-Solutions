//{ Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG
{
    int maxLen(int arr[], int n)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int max = 0;
        int preSum = 0;
        for(int i=0;i<n;i++){
            preSum += arr[i];
            
            if(preSum == 0){
                max = i+1;
            }
            
            if(!map.containsKey(preSum)){
                map.put(preSum,i);
            }
            
            if(map.containsKey(preSum - 0)){
                max = Math.max(max, i-map.get(preSum-0));
            }
        }
        return max;
    }
}
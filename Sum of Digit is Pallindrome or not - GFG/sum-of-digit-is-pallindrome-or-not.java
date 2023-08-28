//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isDigitSumPalindrome(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int isDigitSumPalindrome(int N) {
        int sum = 0;
        int temp1 = N;
        while(temp1>0){
            int rev = temp1%10;
            sum = sum + rev;
            temp1 /= 10;
        }
        int temp2 = sum;
        int sum2 = 0;
        while(temp2 > 0){
            int reverse = temp2%10;
            sum2 = sum2*10 + reverse;
            temp2 /= 10;
        }
        
        if(sum2 == sum){
            return 1;
        }else{
            return 0;
        }
        
    }
}
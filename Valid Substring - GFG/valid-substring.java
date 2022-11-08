//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.findMaxLen(S));
        }
    }
}


// } Driver Code Ends

class Solution {
    static int findMaxLen(String s) {
        
            int ans = 0;
            int close = 0, open = 0, n = s.length();
            
            for(int i = 0;i < n; i++){
                char x = s.charAt(i);
                if(x == '(') open ++;
                else close++;
                if( close == open) ans = Math.max(ans, open);
                else if(close > open) close = open = 0;
            }
            
            close = open = 0;
            
            for(int i = n-1; i >= 0; i--){
                
                char x = s.charAt(i);
                if(x == '(') open ++;
                else close++;
                if( close == open) ans = Math.max(ans, open);
                else if(open > close) close = open = 0;
                
            }
              
             return 2 * ans;
    }
}
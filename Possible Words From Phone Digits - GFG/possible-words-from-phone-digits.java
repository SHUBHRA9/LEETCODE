//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class PhoneDigit
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();//testcases
        
        
        while(t-- > 0)
        {
            int n = sc.nextInt(); // input size of array
            int arr[] = new int[n]; //input the elements of array that are keys to be pressed
            
            for(int i = 0; i < n; i++)
               arr[i] = sc.nextInt();//input the elements of array that are keys to be pressed
            ArrayList <String> res = new Solution().possibleWords(arr, n);
            for (String i : res) System.out.print (i + " ");
             System.out.println();
              
        }
    }
}

// } Driver Code Ends
class Solution
{
    static ArrayList <String> possibleWords(int a[], int N)
    {
        String words[] = {"0","0", "abc", "def","ghi","jkl", "mno","pqrs", "tuv", "wxyz"};
        ArrayList<String> res = new ArrayList<>();
        fun(a,words,res,0,"");
        return res;
    }
    static void fun(int a[],String words[],ArrayList<String> res, int digit, String str)
    {
        if(digit == a.length){
            res.add(str);
            return;
        }
        String keyWord  = words[a[digit]];
        for(int i = 0;i < keyWord.length();i++)
            fun(a,words,res,digit+1,str + keyWord.charAt(i));
    }
}

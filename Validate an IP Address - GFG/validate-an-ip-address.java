//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.io.*;

  public class validip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();

            if (obj.isValid(s))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    public boolean isValid(String s) {
        if(s.charAt(0) == '.' || s.charAt(s.length()-1) ==  '.')return false;
    String[] str = s.split("\\.");
    if(str.length != 4)return false;        

    for(String a: str){
        if(a.matches("[a-zA-Z]"))            //match strings that contain a non-letter
        return false;
        
        if(a.length() == 0 || a.length() >4)     //checks the length of x1,x2,x3,x4 is zero or greater than 4 or not
        return false;
        
        if(a.equals("000") || a.equals("00") || a.equals("0000"))     //checks zeores in the address
        return false;
        
        if(a.length()>1 && a.charAt(0)== '0')       
        return false;
        
        int temp = Integer.parseInt(a);    //converts string to integer to check the range of x1,x2,x3,x4
        if(temp<0 || temp> 255)
        return false;
        }
    return true;
    }
}
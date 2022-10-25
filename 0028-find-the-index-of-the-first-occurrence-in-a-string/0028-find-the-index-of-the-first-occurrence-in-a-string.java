class Solution {
    public int strStr(String a, String b) {
       int n = a.length();
        int m = b.length();
        if(n < m) {return -1;}
        for(int i = 0; i <= n-m; i++) {
          int j;
          for(j = 0; j < m; j++) {
            if(a.charAt(i+j) != b.charAt(j)) {
              break;
            }
          }
          if(j == m) {
            return i;
          }
        }
      return -1; 
    }
}
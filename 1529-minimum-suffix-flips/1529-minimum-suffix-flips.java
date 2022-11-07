class Solution {
    public int minFlips(String target) {
       int n = target.length();
        int flips = 0;
        char status = '0';
        for (int i = 0; i < n; i++)
         {
            if (status != target.charAt(i)) {
                flips++;
            }
             if(flips % 2 == 1) 
             status = '1';
             else
             status ='0'; 
        }
        return flips; 
    }
}
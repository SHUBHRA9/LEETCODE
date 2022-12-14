class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if(s.length == 0 || g.length == 0)
            return 0;
        int n = g.length > s.length ? g.length-1 : s.length-1;
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0, i = s.length-1,j = g.length-1;
        while(n-- >= 0){
            if(i >= 0 && j >= 0 && s[i] >= g[j]){
                count++;
                i--;
                j--;
            }else if(j >= 0 && i >= 0 && s[i] < g[j])
                j--;
        }
        return count;
    }
}
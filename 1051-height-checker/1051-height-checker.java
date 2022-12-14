class Solution {
    public int heightChecker(int[] heights) {
        int[] Frequency = new int[101];
        
        for (int height : heights) {
            Frequency[height]++;
        }
        int result = 0;
        int currentHeight = 0;
        
        for (int i = 0; i < heights.length; i++) {
            while (Frequency[currentHeight] == 0) {
                currentHeight++;
            }
            if (currentHeight != heights[i]) {
                result++;
            }
            Frequency[currentHeight]--;
        }
        return result;
    }
}
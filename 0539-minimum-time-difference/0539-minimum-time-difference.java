class Solution {
    public int findMinDifference(List<String> timePoints) {
        int totalSec = 1440; //60*24
        int[] arr = new int[timePoints.size()];
        for(int i=0;i<timePoints.size();i++){
            String time[] = timePoints.get(i).split(":");
            int hh = Integer.parseInt(time[0]);
            int mm = Integer.parseInt(time[1]);
            arr[i] = hh*60+mm;
        }
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            min = Math.min(min,Math.abs(arr[i]-arr[i+1]));
        }
        int corner = arr[0] + (totalSec - arr[arr.length-1]);
        return Math.min(min,corner);
    }
}
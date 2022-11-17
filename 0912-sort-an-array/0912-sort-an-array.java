class Solution {
    public int[] sortArray(int[] nums) {
       if(nums.length == 1)
	{
        return nums;
    }
    int len = nums.length;
    int mid = len/2;
    int[] left = sortArray(Arrays.copyOfRange(nums, 0, mid));
    int[] right = sortArray(Arrays.copyOfRange(nums, mid, len));
    return merge(left, right);
}
public int[] merge(int[] first, int[] second){
    int[] res = new int[first.length+second.length];
    int i = 0, j = 0, k = 0;
    while(i < first.length && j < second.length){
        if(first[i] < second[j]){
            res[k] = first[i];
            i++;
        }else{
            res[k] = second[j];
            j++;
        }
        k++;
    }
    while(i < first.length){
        res[k] = first[i];
        i++;
        k++;
    }
    while(j < second.length){
        res[k] = second[j];
        j++;
        k++;
    }
    return res;
    }
}
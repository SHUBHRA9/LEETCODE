class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);

int sum[]= new int[nums.length/2];  
int s=0,max=0,j=nums.length-1;      //creating array to store pairs
for(int i=0;i<nums.length/2;i++){
    s=nums[i]+nums[j--];                    //sum of pair
    if(s>max)
    max=s;                                  //storing the maximum pair sum
    }
    return max;
    }
}
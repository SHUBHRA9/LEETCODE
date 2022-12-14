class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int n3;
        double median=0.0;
        int n1 = nums1.length;
        int n2= nums2.length;
        int[] nums3=new int[n1+n2];
                               // traverse the array nums1 and insert its element in nums3
     for(i =0;i<n1;i++){             
         nums3[i] = nums1[i];
     }
                               // traverse the array nums2 and insert its element in nums3
        for(i =0;i<n2;i++){              
            nums3[n1+i] = nums2[i];
        }
                               // sort the whole array nums3
      Arrays.sort(nums3);
        n3=n1+n2;
                               //calculate median if there are even number of elements
        if(n3%2==0)            
        {
            median=(nums3[(n3/2)-1]+nums3[((n3/2)+1)-1])/2.0;
        }
                                 //calculate median if there are odd number of elements
        else
        {
            median=nums3[((n3+1)/2)-1];
        }
                                  //returns the median from the merged array
        return median;
    }
}
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
          if (m == 0 && n==1) {
            nums1[m] = nums2[n - 1];
            return;
        }
        int len = nums1.length;
        int lastIndex1 = m - 1;
        int lastIndex2 = n - 1;
        for (int i = len - 1; lastIndex2 >= 0; i--) {
            if (lastIndex1>=0 && nums1[lastIndex1] > nums2[lastIndex2]) {
                nums1[i] = nums1[lastIndex1];
                lastIndex1--;
            } else {
                nums1[i] = nums2[lastIndex2];
                lastIndex2--;
            }
        }
    }
}
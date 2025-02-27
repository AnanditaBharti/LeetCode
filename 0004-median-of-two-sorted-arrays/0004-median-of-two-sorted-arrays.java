class Solution {
    public double evenLengthMedian(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int mid1 = (n + m) / 2 - 1;
        int mid2 = (n + m) / 2;
        int ptr1 = 0;
        int ptr2 = 0;
        int index = 0;
        int result = 0;
        boolean gotMid1 = false;
        while (ptr1 < n && ptr2 < m) {
            if (nums1[ptr1] <= nums2[ptr2]) {
                if (index == mid1) {
                    result += nums1[ptr1];
                    gotMid1 = true;
                }
                else if (index == mid2) {
                    result += nums1[ptr1];
                    return result / 2.0;
                }
                ptr1 ++;
            }
            else {
                if (index == mid1) {
                    result += nums2[ptr2];
                    gotMid1 = true;
                }
                else if (index == mid2) {
                    result += nums2[ptr2];
                    return result / 2.0;
                }
                ptr2 ++;
            }
            index ++;
        }
        if (ptr1 >= n) {
            if (gotMid1) {
                result += nums2[ptr2 + mid2 - index];
                return result / 2.0;
            }
            else {
                result = nums2[ptr2 + mid1 - index] + nums2[ptr2 + mid2 - index];
                return result / 2.0;
            }
        }
        else {
            if (gotMid1) {
                result += nums1[ptr1 + mid2 - index];
                return result / 2.0;
            }
            else {
                result = nums1[ptr1 + mid1 - index] + nums1[ptr1 + mid2 - index];
                return result / 2.0;
            }
        }
    }
    public double oddLengthMedian(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int mid = (n + m) / 2;
        int ptr1 = 0;
        int ptr2 = 0;
        int index = 0;
        while (ptr1 < n && ptr2 < m) {
            if (nums1[ptr1] <= nums2[ptr2]) {
                if (index == mid) {
                    return (double) nums1[ptr1];
                }
                ptr1 ++;
            }
            else {
                if (index == mid) {
                    return (double) nums2[ptr2];
                }
                ptr2 ++;
            }
            index ++;
        }
        if (ptr1 >= n) {
            return nums2[ptr2 + (mid - index)];
            // if (index == mid) {
            //     return (double) nums2[ptr2];
            // }
            // index ++;
            // ptr2 ++;
        }
        else {
            return nums1[ptr1 + (mid - index)];
        }
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if ((nums1.length + nums2.length) % 2 == 0)
            return evenLengthMedian(nums1, nums2);
        else
            return oddLengthMedian(nums1, nums2);
        
    }
}
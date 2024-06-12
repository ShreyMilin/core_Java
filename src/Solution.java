import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int temp[] = new int[nums1.length+nums2.length];
        int l1= nums1.length;
        int l2=nums2.length;
        for(int i=0;i<l1;i++){
            temp[i]=nums1[i];
        }
        for(int j=0;j<l2;j++){
            temp[l1]=nums2[j];
            l1++;

        }
        Arrays.sort(temp);
        System.out.println(Arrays.toString(temp));
        int mid = temp.length/2;
        if(temp.length%2==0){
            double a = temp[mid];
            double b = temp[mid-1];
            double median = (a+b)/2;
            return median;
        }
        else {
            double median = temp[mid];
            return median;
        }
    }
}
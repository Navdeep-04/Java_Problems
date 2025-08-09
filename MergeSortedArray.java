import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,5,6};
        int m = nums1.length;
        int n = nums2.length;
        int[] arr = new int[m+n];
        for(int i = 0; i < m+n; i++)
        {
            if(i < m){
                arr[i] = nums1[i];
            }
            else{
                arr[i] = nums2[i-m];
            }
        }
        Arrays.sort(arr);
        String string = Arrays.toString(arr);
        System.out.println(string);
    }
}

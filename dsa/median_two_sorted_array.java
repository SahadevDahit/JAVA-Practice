package dsa;

public class median_two_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};

        // Calculate the length of the merged array
        int mergedLength = nums1.length + nums2.length;

        // Create a new array with enough space to hold all elements
        int[] mergedArray = new int[mergedLength];

        // Copy elements from array1 to mergedArray
        System.arraycopy(nums1, 0, mergedArray, 0, nums1.length);

        // Copy elements from array2 to mergedArray
        System.arraycopy(nums2, 0, mergedArray, nums1.length, nums2.length);

        int length=mergedArray.length;

	        
	        if(length%2!=0) {
	        	System.out.println("median is " +mergedArray[length/2]);
	        }else {
	        	int index=length/2;
	        	double median = (mergedArray[index]+mergedArray[index-1]);
	        	System.out.println(median/2);
	        
	      }      
	}

}

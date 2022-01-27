package AssistedPracticeprojects;

class RotateArray { 
public void rotate(int[] nums, int a) {
    		if(a > nums.length) 
       			a=a%nums.length;
 		int[] result = new int[nums.length];
 		for(int i=0; i < a; i++){
        			result[i] = nums[nums.length-a+i];
 		}
 		int j=0;
    		for(int i=a; i<nums.length; i++){
        			result[i] = nums[j];
                    j++;
    		}
 		System.arraycopy( result, 0, nums, 0, nums.length );
}
} 
public class Array_rotation {

	public static void main(String[] args) {
		RotateArray r = new RotateArray();
		int arr[] = { 1, 2, 3, 4, 5 , 6, 7}; 
		r.rotate(arr, 5); 
		for(int i=0;i<arr.length;i++){
    			System.out.print(arr[i]+" ");
		}

	}

}

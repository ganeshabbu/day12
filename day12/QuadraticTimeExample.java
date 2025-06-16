package day12;

public class QuadraticTimeExample {

	public static void main(String[] args) {
		 int[] nums = {1,3,5,7,3};
		 boolean hasDuplicate = false;
		 for(int i =0;i<nums.length-1;i++) {
			 for(int j = i+1;j<nums.length;j++) {
				 if(nums[i] == nums[j]) {
					 hasDuplicate = true;
					 System.out.println("dupliacte Found: "+ nums[i]);
				 }
			 }
		 }
		 if(!hasDuplicate) {
			 System.out.println("No Duplicates found.");
		 }
	}

}

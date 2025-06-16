package day12;

public class ConstantTimeExample {
	public static void printFirstElement(int[] arr) {
		 for(int i = 0;i<arr.length;i++)
		 {
			 System.out.println(arr[i]);
		 }
	}
	public static void main(String[] args) {
		 int[] nums ={1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
	             11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		 
		 //calling the o(1)
		 printFirstElement(nums);
	}
}

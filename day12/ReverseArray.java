package day12;

public class ReverseArray {

	public static void main(String[] args) {
		 int[] n = {2,3,4,5,6};
		 System.out.println("the original array:");
		 for(int i =0 ;i <=n.length-1;i++) {
			 System.out.print(n[i]+" ");
		 }
		 System.out.println("\nthe reversed Array:");
		 for(int i = n.length-1;i>=0;i--) {
			 System.out.print(n[i]+" ");
		 }
	}

}

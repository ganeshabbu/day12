package day12;

public class Sorting {

	public static void main(String[] args) {
		 String[] na = {"gani","vijay","adithya","Arjun"};
		 String temp;
		 System.out.println("Original String:");
		 for(String s:na) {
			 System.out.print(s+" ");
		 }
		 for(int i = 0; i < na.length-1;i++) {
			 for(int j = 0; j < na.length-i-1;j++) {
				 if(na[j].compareTo(na[j+1])> 0) {
					 temp = na[j];
					 na[j] = na[j+1];
					 na[j+1] = temp;
				 }
			 }
		 }
		 System.out.println("\nafter sorting the Strings in Alphabetical Order:");
		 for(String s:na) {
			 System.out.print(s + " ");
		 }

	}

}

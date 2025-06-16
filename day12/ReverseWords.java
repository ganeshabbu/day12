package day12;

public class ReverseWords {

	public static void main(String[] args) {
		  
		String s = "ganesh is working";
		String[] n = s.split(" ");
		for(int i = n.length-1;i>=0;i--) {
			
			System.out.print(n[i]+" ");
		}
		
	}

}

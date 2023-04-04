package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		int[] array1= {3,2,11,4,6,7};
		int[] array2= {1,2,8,4,9,7};
		 System.out.println("Common values:");
		for(int i=0; i<array1.length;i++) {
			for(int n=0; n<array2.length; n++) {
				if(array1[i]== array2[n]) {
						System.out.println(array1[i]);
								}
	}
	}	
	}
}

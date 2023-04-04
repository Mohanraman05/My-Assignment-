package week1.day2;

public class PrintDuplicateInArray {
public static void main(String[] args) {
	int arr[]= new int[] {14,12,13,11,15,14,18,16,17,19,18,17,20};
	System.out.println("Duplicate entries: ");
	for(int i=0; i<arr.length-1;i++) {
		for(int n=i+1; n<arr.length; n++) {
			if(arr[i]== arr[n]) {
					System.out.println( arr[i]);
							}
}
}
}
}
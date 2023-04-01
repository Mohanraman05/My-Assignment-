package week1.day1;

public class fibonacci{
	public static void main(String[] args) {
		int x = 0;
		int y = 1;
			System.out.println("Fibonacci");
		for(int i = 1; i <=13 ; ++i) {
			System.out.println(+x);
			int z=x+y;
			x=y;
			y=z;			
		}
		}
}



public class DisplayFibonacciSeries {

	public static void main(String[] args) {
		int x=0,y=1;
		for(int i=1;i<10;i++) {
			
			System.out.println(x+",");
		
			int z=x+y;
			x=y;
			y=z;
			
		}

	}

}

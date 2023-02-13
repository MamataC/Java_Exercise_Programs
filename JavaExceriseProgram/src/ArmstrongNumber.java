
public class ArmstrongNumber {

	public static void main(String[] args) {
		
			
			int num=371,sum=0;
			int number=num;
			for(;num!=0;num=num/10) {
				
				int r=num%10;
				sum=sum+r*r*r;
			}
			if(sum==number)
				System.out.println("Armstrong");
			else
			System.out.println("not Armstrong");
		}
	}



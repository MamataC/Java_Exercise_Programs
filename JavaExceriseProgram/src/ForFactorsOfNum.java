import java.util.Scanner;

public class ForFactorsOfNum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n, i, j, x = 0, k = 0,count=0;
		int a[] = new int[5];
		System.out.println("Enter number:-");
		n = in.nextInt();

		for (i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
				for (j = 2; j < i; j++) {
					x = 0;
					if (i % j == 0) {
						x = 1;
						break;
					}
				}
				if (x == 0) {
					// System.out.print(i+" ");
					a[k] = i;
					k++;
					count++;

				}

			}

		}

		for (int l = 0; l <count; l++) {
			System.out.print(a[l] + " ");
		}
	}

}

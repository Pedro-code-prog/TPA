import java.util.Scanner;
public class Ex6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int TAM = 11;
		int a[], i= 0;
		a = new int [TAM];
		
		a[0] = 1;
		
		for(i=1; i<TAM; i++) {
			a[i] = a[i-1]*2;
		}
		for(i=0; i<TAM; i++) {
			System.out.println("a[" + (i+1) + "]" + a[i]);
		}
		sc.close();
	}
}

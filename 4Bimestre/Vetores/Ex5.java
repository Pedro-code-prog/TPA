import java.util.Scanner;
public class Ex5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int TAM = 10;
		int i, j, a[];
		
		a = new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+i+" valor");
			a[i] = sc.nextInt();
		}
		for(i=0; i<TAM; i++) {
			System.out.println("Os divisores de " + a[i] + " são:");
			
			for(j = 1; j<a[i]; j++) {
				if(a[i]%j==0) {
				System.out.println(j);
				}
			}
		}
		sc.close();
	}
}

import java.util.Scanner;
public class Ex8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int TAM = 10;
		int a[], b[], i, j;
		a = new int [TAM];
		b = new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o valor da " + (i+1) +" posição");
			a[i] = sc.nextInt();
		}
		for(i=0; i<TAM; i++) {
			int soma = 0;
			for(j=i; j<TAM; j++) {
				soma+=a[j];
			}
			b[i] = soma;
			System.out.println("b[" + (i+1) + "]" + b[i]);
		}
	}
}

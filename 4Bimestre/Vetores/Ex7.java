import java.util.Scanner;
public class Ex7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int TAM = 15;
		int a[], b[], i, fa = 1, ii;
		
		a = new int [TAM];
		b = new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o valor da " + (i+1) +" posição");
			a[i] = sc.nextInt();
		}
		for(i=0; i<TAM; i++) {
			fa = 1;
			for(ii=1; ii<a[i]; ii++) {
				fa*=ii;
			}
			b[i] = fa;
			System.out.println("O fatorial de " +a[i]+ "(Vetor A)" + " é igual à: " + b[i] + "(Vetor B)");
		}
		sc.close();
	}
}

import java.util.Scanner;
public class Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i, j, contPar = 0, contImpar = 19;
		final int TAM = 20;
		int [] a, b;
		
		a = new int [TAM];
		b = new int [TAM];
		
		//lendo
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o valor da posição " + i + " do vetor A");
			a[i] = sc.nextInt();
		//separando
			if(a[i] % 2 == 0) {
				b[contPar] = a[i];
				contPar++;
			}else {
				b[contImpar] = a[i];
				contImpar--;
			}
		}
		
		//apresentando
		System.out.println("\nPares e ímpares:");
		for(i=0; i<TAM; i++) {
			System.out.println(b[i]);
		}
		sc.close();
	}
}

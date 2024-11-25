import java.util.Scanner;
public class Ex2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 5;
		
	//criando os vetores
		int a[], b[], i, ii;
		a = new int [TAM];
		b = new int [TAM];
		
	//laço para a leitura do vetor a
		for(i=0; i<TAM; i++) {
			System.out.println("Digite um valor para a posição "+(i)+" do vetor a");
			a[i] = ler.nextInt();
		}
		//criando e apresentando a tabuada
		System.out.println("\nA = ");
		for(i=0; i<=TAM; i++) {
			System.out.print("\nTabuada do " + a[i] + ":");
			for(ii=0; ii<=10; ii++) {
				System.out.println(a[i] + " x " + ii + " = "  + (a[i]*ii));
			}
		}
		ler.close();
	}
}


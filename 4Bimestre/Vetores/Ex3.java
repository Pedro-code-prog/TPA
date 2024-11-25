import java.util.Scanner;
public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, a[];
		final int TAM = 10;
		a = new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite um valor para a posição "+(i)+" do vetor a");
			a[i] = sc.nextInt();
			
			for(j=2; j<a[i]; j++) {
				
				if(a[i]/j == 0) {
					System.out.println(a[i] + " é primo");
				}else {
					System.out.println(a[i] + " não é primo");
				}
		}

		}
	}
}

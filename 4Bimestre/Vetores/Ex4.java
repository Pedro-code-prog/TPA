import java.util.Scanner;
public class Ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int TAM = 10;
		int i, j, a[];
		
		a = new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+ i +" valor");
			a[i] = sc.nextInt();
		}
		for(i=0; i<TAM; i++) {
			System.out.println("Valores pares anteriores do respectivo elemento");
			for(j=0; j<a[i]; j=j+2) {
				System.out.println(j);
			}
		}
		sc.close();
	}
}

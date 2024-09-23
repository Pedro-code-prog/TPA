import java.util.Scanner;
public class Exercicio2test {
	public static void main(String Args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n, a, i;
		int c = 0;
		
		while(c<=5) {
			System.out.println("Digite o seu ano de nascimento");
			n = sc.nextInt();
		
			System.out.println("Digite o ano atual");
			a = sc.nextInt();
		
			i = a - n;
		
			if(i>=18) {
				System.out.println("O usuário é maior de idade(" + i + ")");
			}else {
				System.out.println("O usuário é menor de idade(" + i + ")");
			}
		c++;
		}
		sc.close();
	}
}

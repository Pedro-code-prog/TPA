import java.util.Scanner;
public class ExercicioC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, i, r;
		r = 1;
		i = 1;
		System.out.println("Digite o número do qual deseja ver o fatorial");
		num = sc.nextInt();
		
		while(i<=num) {
			r*=i;
			
			i++;
		}
		System.out.println("O fatorial de "+num+" é igual a "+r);
	}
}

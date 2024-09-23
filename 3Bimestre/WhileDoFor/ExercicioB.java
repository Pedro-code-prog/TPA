import java.util.Scanner;
public class ExercicioB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=0;
		int num, r;
		
		System.out.println("Digite o número que deseja ver a tabuada");
		num = sc.nextInt();
		
			while(i<11) {
					r=num*i;
					System.out.println(num+" x "+i+" = " +r);
					
					i++;
		}
		
	}
}


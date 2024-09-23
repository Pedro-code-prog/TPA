import java.util.Scanner;
public class exercicio1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n;
	System.out.println("Digite o último número de sua placa");
		n = ler.nextInt();
	
		switch(n) {
			case 0:
			case 1:
				System.out.println("O dia do rodízio é segunda");
				break;
			case 2:
			case 3:
				System.out.println("O dia do rodízio é terça");
				break;
			case 4:
			case 5:
				System.out.println("O dia do rodízio é quarta");
				break;
			case 6:
			case 7:
				System.out.println("O dia do rodízio é quinta");
				break;
			case 8:
			case 9:
				System.out.println("O dia do rodízio é sexta");
				break;
			default:
				System.out.println("Dia Inválido");
				
				
		}
	
		
		
	}
}

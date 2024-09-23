import java.util.Scanner;
public class Exercise4 {
	public static void main(String[] args) {
		int at, idade, an, idvelho = 0, idnovo = 0;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o ano atual");
		at = ler.nextInt();
		for(int i=1; i<=10; i++) {
			System.out.println("Digite seu ano de nascimento");
			an = ler.nextInt();
			idade = at-an;
			System.out.println("O usuário "+i+" tem "+idade+" anos.");
			
			if(idvelho<idade) {
				idvelho=idade;
			}
			idnovo=idade;
			if(idnovo>idade) {
				idnovo=idade;
			}
		}
		System.out.println("A idade do usuário mais velho é:"+idvelho);
		System.out.println("A idade do usuário mais novo é:"+idnovo);
	}
}

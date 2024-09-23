import java.util.Scanner;
public class Exercício1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int d, m;
		
		System.out.println("Digite o seu dia de aniversário");
		d = ler.nextInt();
		
		System.out.println("Digite o seu mês de aniversário");
		m = ler.nextInt();
		ler.close();
		switch(m) {
			case 1: if(d>=21){
				System.out.println("Aquário");
			}else {
				System.out.println("Capricórnio");
			}
				break;
				
			case 2: if(d<=19){
				System.out.println("Aquário");
			}else {
				System.out.println("Peixes");
			}
				break;
				
			case 3:	if(d<=20){
				System.out.println("Peixes");
			}else {
				System.out.println("Áries");
			}
				break;
				
			case 4:	if(d<=20){
				System.out.println("Áries");
			}else {
				System.out.println("Touro");
			}
				break;

			case 5:	if(d<=20){
				System.out.println("Touro");
			}else {
				System.out.println("Gêmeos");
			}
				break;

			case 6:	if(d<=20){
				System.out.println("Gêmeos");
			}else {
				System.out.println("Câncer");
			}
				break;

			case 7:	if(d<=21){
				System.out.println("Câncer");
			}else {
				System.out.println("Leão");
			}
				break;

			case 8:	if(d<=22){
				System.out.println("Leão");
			}else {
				System.out.println("Virgem");
			}
				break;
				
			case 9:	if(d<=22){
				System.out.println("Virgem");
			}else {
				System.out.println("Libra");
			}
				break;
			
			case 10: if(d<=22){
				System.out.println("Libra");
			}else {
				System.out.println("Escorpião");
			}
				break;	
				
			case 11: if(d<=21){
				System.out.println("Escorpião");
			}else {
				System.out.println("Ságitário");
			}
				break;
				
			case 12: if(d<=21){
				System.out.println("Sagitário");
			}else {
				System.out.println("Capricórnio");
			}
				break;
				
			default:
				System.out.println("Dia ou Mês inválidos");
			
		}
		
	}

}

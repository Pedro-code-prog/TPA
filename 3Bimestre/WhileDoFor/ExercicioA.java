
public class ExercicioA {
	public static void main(String[] args) {
		double alP= 145;
		double alJ = 134;
		double p, j;
		int i=0;
		
		j=134;
		p=145;
		
		while(j<p) {
			p=alP+(2*i);
			j=alJ+(2.5*i);
		
			i++;
		}
		System.out.println("João ficará mais alto que Pedro em "+i+" anos.");
	}
}

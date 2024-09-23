import java.util.Scanner;
public class exercicio23 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a quantidade de alunos: ");
        int qtdAlunos = in.nextInt();

        int alunoAtual = 0;

        int qtdMb = 0;
        int qtdB = 0;
        int qtdR = 0;
        int qtdI = 0;

        do {
            System.out.println("Digite a nota do aluno " + (alunoAtual + 1) + " (mb, b, r, i): ");
            String nota = in.next().toLowerCase();

            alunoAtual += 1;

            switch (nota) {
                case "mb":
                    qtdMb += 1;
                    break;
                case "b":
                    qtdB += 1;
                    break;
                case "r":
                    qtdR += 1;
                    break;
                case "i":
                    qtdI += 1;
                    break;
                default:
                    System.out.println("Nota inválida. Por favor, insira mb, b, r ou i.");
                    alunoAtual -= 1; // Não conta aluno atual se a nota for inválida
                    break;
            }
        } while (alunoAtual < qtdAlunos);

        // Calculando as porcentagens
        double percMb = (qtdMb / (double)qtdAlunos) * 100;
        double percB = (qtdB / (double)qtdAlunos) * 100;
        double percR = (qtdR / (double)qtdAlunos) * 100;
        double percI = (qtdI / (double)qtdAlunos) * 100;
        
        // Exibindo os resultados com System.out.println
        System.out.println("Resumo das notas:");
        System.out.println("Muito Bom (mb): " + percMb + "%");
        System.out.println("Bom (b): " + percB + "%");
        System.out.println("Regular (r): " + percR + "%");
        System.out.println("Insuficiente (i): " + percI + "%");
    }
}


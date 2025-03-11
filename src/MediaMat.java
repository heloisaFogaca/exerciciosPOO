import java.util.Scanner;

public class MediaMat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float media= 0, nota=0, total=0;
        String nome;

        System.out.println("Informe o nome do(a) aluno(a):");
        nome = scanner.nextLine();

        for(int i=1; i<5; i++){
            System.out.println("Informe a nota número " + i + " do aluno");
            nota = scanner.nextFloat();
            total += nota;
        }

        media = total/4;

        System.out.println("A média do(a) aluno(a) " + nome + " é " + media);
    }
}

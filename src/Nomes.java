import java.util.Scanner;

public class Nomes {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String nome1="mestre do universo", nome2;

        System.out.println("Digite um valor para ser armazenado:");
        nome2=scanner.nextLine();

        nome1 = nome2;

        System.out.println("Valores alternados: " + nome1);


    }
}

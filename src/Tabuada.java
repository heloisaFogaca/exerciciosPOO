import java.util.Scanner;

public class Tabuada {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int numero;

        System.out.println("Informe o número da tabuada: ");
        numero = scanner.nextInt();

        for(int i=0; i<11; i++){
            System.out.println(numero + "x" + i + "=" + numero*i);
        }
    }
}

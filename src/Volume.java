import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double V, R, A;

        System.out.println("Informe o raio da lata de óleo: ");
        R = sc.nextFloat();

        System.out.println("Informe a altura da lata de óleo: ");
        A = sc.nextFloat();

        V = 3.14159 * R * R * A;

        System.out.println("O volume da lata de óleo é: " + V);
    }
}

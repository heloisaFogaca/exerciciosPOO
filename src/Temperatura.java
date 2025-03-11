import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float temperatura;

        System.out.println("Informe a temperatura em Celcius (C°):");
        temperatura = scanner.nextFloat();

        System.out.println("Temperatura em Fahrenheit: " + (temperatura * 1.8 + 32) + " F");
        System.out.println("Temperatura em Kelvin: " + (temperatura + 273.15) + " K");
        System.out.println("Temperatura em Réaumur: " + (temperatura * 0.8) + " Re");
        System.out.println("Temperatura em Rankine: " + (temperatura * 1.8 + 32 + 459.67) + " Ra");


    }
}

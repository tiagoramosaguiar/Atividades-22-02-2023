package Atividades;
import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float celsius, fahrenheit;
        
        System.out.print("Insira a temperatura em Celsius: ");
        celsius = scan.nextFloat();
        fahrenheit = (9 * celsius + 160) / 5;
        
        System.out.println("↓");
        System.out.printf("Temperatura em Fahrenheit: %.1f °F", fahrenheit);
    }
}

package Atividades;
import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, soma;
        
        System.out.print("Insira valor de A (número inteiro): ");
        a = scan.nextInt();
        System.out.print("Insira valor de B (número inteiro): ");
        b = scan.nextInt();
        
        soma = (a * a) + (b * b);
        
        System.out.println("↓");
        System.out.println("Resultado do quadrado da soma: " + soma);
    }
}

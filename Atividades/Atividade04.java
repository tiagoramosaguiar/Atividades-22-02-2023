package Atividades;
import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer a, b;
        
        System.out.print("Insira valor de A (número inteiro): ");
        a = scan.nextInt();
        System.out.print("Insira valor de B (número inteiro): ");
        b = scan.nextInt();
        
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("↓");
        System.out.println("Valor de A após troca: " + a);
        System.out.println("Valor de B após troca: " + b);
    }
}

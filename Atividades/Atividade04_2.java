package Atividades;
import java.util.Scanner;

public class Atividade04_2 {
    public static void main(String[] args) {
        String a, b, auxiliar;
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira valor de A: ");
        a = scan.nextLine();
        System.out.print("Insira valor de B: ");
        b = scan.nextLine();
        auxiliar = a;
        a = b;
        b = auxiliar;
        System.out.println("↓");
        System.out.println("Valor de A após troca: " + a);
        System.out.println("Valor de B após troca: " + b);
    }
}

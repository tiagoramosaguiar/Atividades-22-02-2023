package Atividades;
import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        int numero1, numero2, restodiv, quociente;
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira um número (inteiro): ");
        numero1 = scan.nextInt();
        System.out.print("Insira um número (inteiro): ");
        numero2 = scan.nextInt();
        restodiv = numero1 % numero2;
        quociente = numero1 / numero2;
        System.out.println("↓");
        System.out.println("Quociente: " + quociente);
        System.out.println("Resto da divisão: " + restodiv);
    }
}

package Atividades;
import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero1, numero2, quociente, restodiv;
        
        System.out.print("Insira um número (inteiro): ");
        numero1 = scan.nextInt();
        System.out.print("Insira um número (inteiro): ");
        numero2 = scan.nextInt();
        
        quociente = numero1 / numero2;
        restodiv = numero1 % numero2;
        
        System.out.println("↓");
        System.out.println("Quociente: " + quociente);
        System.out.println("Resto da divisão: " + restodiv);
    }
}

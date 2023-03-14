package Atividades;
import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        int numero1, numero2, soma;
	    
        System.out.print("Insira um número (inteiro): ");
        numero1 = scan.nextInt();
        System.out.print("Insira um número (inteiro): ");
        numero2 = scan.nextInt();
	    
        soma = numero1 + numero2;
	
        System.out.println("↓");
        System.out.println("Soma dos números: " + soma);
    }
}

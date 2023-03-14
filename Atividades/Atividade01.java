package Atividades;
import java.util.Scanner;

public class Atividade01 {
    public static void main (String[] args) {
        
        Scanner scan = new Scanner(System.in);
        float nota1, nota2, nota3, media;
        String nomeAluno;
        
        System.out.print("Insira nome do aluno: ");
        nomeAluno = scan.nextLine();
        System.out.print("Insira primeira nota: ");
        nota1 = scan.nextFloat();
        System.out.print("Insira segunda nota: ");
        nota2 = scan.nextFloat();
        System.out.print("Insira terceira nota: ");
        nota3 = scan.nextFloat();
        
        media = (nota1 + nota2 + nota3) / 3;
        
        System.out.println("↓");
        System.out.printf("Média do aluno " + nomeAluno + ": %.2f -> ", media);
        
        if (media >= 6) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
        
    }
}

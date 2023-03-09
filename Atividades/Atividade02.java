package Atividades;

import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        Integer i;
        String textoInvertido, texto;
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira algo: ");
        texto = scan.nextLine();
        textoInvertido="";
        for (i = texto.length()-1; i >= 0; i--) {
            textoInvertido = textoInvertido + texto.charAt(i);
        }
        System.out.println("↓");
        System.out.print("Inversão: " + textoInvertido);
    }
}
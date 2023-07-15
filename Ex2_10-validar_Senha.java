//Faça um algoritmo que verifique a validade de uma senha fornecida pelo usuário. Sabendo que a senha é UFABC ou ufabc, imprimir mensagem de "Acesso Liberado!" ou "Acesso Negado!".

import java.util.Scanner;
public class Programa {
  public static void main(String[] args) {
    // ENTRADAS
    Scanner teclado1 = new Scanner(System.in);
    String senha = teclado1.nextLine();
    // PROCESSAMENTO E SAÍDA
    if (senha.equals("UFABC")) {
        System.out.print("Acesso Liberado!");
    } else if (senha.equals("ufabc")) {
        System.out.print("Acesso Liberado!");
    } else {
        System.out.print("Acesso Negado!");
    }
  }
} 

//Ler um número inteiro e apresentar uma mensagem informando se o número é par ou ímpar. 

import java.util.Scanner;
public class Programa {
  public static void main(String[] args) {
    // ENTRADAS
    Scanner teclado1 = new Scanner(System.in);
    int numero = teclado1.nextInt();
    // PROCESSAMENTO E SAÍDA
    int numero_par = numero%2;
    if (numero_par == 0) {
        System.out.print("Eh par!");
    } else {
        System.out.print("Eh impar!");
    }
  }
} 

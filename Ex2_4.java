//Ler dois valores inteiros e apresentar o maior valor. Supor que não sejam iguais.

import java.util.Scanner;
public class Programa {
  public static void main(String[] args) {
    // ENTRADAS
    Scanner teclado1 = new Scanner(System.in);
    int a = teclado1.nextInt();
    int b = teclado1.nextInt();
    // PROCESSAMENTO E SAÍDA
    if (a > b)
        System.out.print("O maior eh: "+a+".");
    else
        System.out.print("O maior eh: "+b+".");
  }
} 

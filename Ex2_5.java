//Ler dois números do tipo float e apresentá-los em ordem decrescente. Supor que não sejam iguais.

import java.util.Scanner;
public class Programa {
  public static void main(String[] args) {
    // ENTRADAS
    Scanner teclado1 = new Scanner(System.in);
    float a = teclado1.nextFloat();
    float b = teclado1.nextFloat();
    // PROCESSAMENTO E SAÍDA
    if (a > b) {
        System.out.printf("%.1f\n", a);
        System.out.printf("%.1f\n", b);
    } else {
        System.out.printf("%.1f\n", b);
        System.out.printf("%.1f\n", a);
    }
  }
} 

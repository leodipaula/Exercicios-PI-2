//Ler dois valores inteiros e efetuar a adição:
//Caso o resultado seja maior ou igual a 10, deve ser acrescido de 5;
//Caso contrário, o resultado deve ser diminuído em 7. 
//Ao final apresentar o resultado após a avaliação da condição.

import java.util.Scanner;
public class Programa {
  public static void main(String[] args) {
    // ENTRADAS
    Scanner teclado1 = new Scanner(System.in);
    int n1 = teclado1.nextInt();
    int n2 = teclado1.nextInt();
    // PROCESSAMENTO E SAÍDA
    int soma = n1+n2;
    if (soma >= 10) {
      int soma_2 = soma + 5;
        System.out.println(soma_2);
    } else {
        int soma_2 = soma - 7;
        System.out.print(soma_2);
    }
  }
} 

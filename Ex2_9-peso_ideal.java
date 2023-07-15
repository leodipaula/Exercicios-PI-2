//Implemente um algoritmo que leia o sexo (0 para homem e 1 para mulher) e a altura de uma pessoa, calcule e mostre seu peso ideal. Sabendo que:

//Para homens: (72,7 * h) – 58
//Para mulheres (62,1 * h) – 44,7
//Ps: O resultado (saída) deve ser impresso com DUAS casas decimais.

import java.util.Scanner;
public class Programa {
  public static void main(String[] args) {
    // ENTRADAS
    Scanner teclado1 = new Scanner(System.in);
    int sexo = teclado1.nextInt();
    float altura = teclado1.nextFloat();
    // PROCESSAMENTO E SAÍDA
    if (sexo == 0) {
        double peso_ideal = (72.7*altura)-58;
        System.out.printf("Peso ideal eh: %.2f", +peso_ideal);
    } else {
        double peso_ideal = (62.1*altura)-44.7;
        System.out.printf("Peso ideal eh: %.2f", +peso_ideal);
    }
  }
} 

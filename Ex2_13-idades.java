//Implementar um algoritmo que receba a idade de uma pessoa e informe:
//Se é maior de idade: "Maior de Idade!";
//Se é menor de idade: "Menor de Idade!";
//Se é maior ou igual a 65 anos: "Maior de 65 anos!"; 
//Entretanto, caso a idade digitada for menor que ZERO, deve-se imprimir a seguinte mensagem: “Idade Invalida!”.

import java.util.Scanner;
public class Programa {
  public static void main(String[] args) {
    // ENTRADAS
    Scanner teclado1 = new Scanner(System.in);
    int idade = teclado1.nextInt();
    // PROCESSAMENTO E SAÍDA
    if (idade == 18 || idade > 18 && idade < 65) {
        System.out.print("Maior de Idade!");
    } else if (idade >= 65) {
        System.out.print("Maior de 65 anos!");
    } else if (idade < 18 && idade > 0) {
        System.out.print("Menor de Idade!");
    } else if (idade <= 0) {
        System.out.print("Idade Invalida!");
    }
  }
} 

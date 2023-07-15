//A prefeitura do Rio de Janeiro abriu uma linha de crédito para os funcionários estatutários.
//O valor máximo da prestação não poderá ultrapassar 30% do salário bruto.
//Implementar um algoritmo que leia o salário bruto e o valor da prestação e informar se o empréstimo pode ("Emprestimo Liberado!") ou não ("Emprestimo Negado!") ser concedido.

import java.util.Scanner;
public class Programa {
  public static void main(String[] args) {
    // ENTRADAS
    Scanner teclado1 = new Scanner(System.in);
    int salario_bruto = teclado1.nextInt();
    int valor_prestacao = teclado1.nextInt();
    // PROCESSAMENTO E SAÍDA
    double teste_prest = salario_bruto*0.3;
    if (valor_prestacao > teste_prest) {
        System.out.print("Emprestimo Negado!");
    } else {
        System.out.print("Emprestimo Liberado!");
    }
  }
} 

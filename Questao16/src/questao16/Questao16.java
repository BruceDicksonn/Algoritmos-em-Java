package questao16;

import java.util.Scanner;

public class Questao16 {

   
    public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);
          System.out.print("Informe um número: ");
          int n = teclado.nextInt();
          
          switch (n){
              case 1:
                  System.out.println("Janeiro");
              break;
              case 2:
                  System.out.println("Fevereiro");
              break;
              case 3:
                  System.out.println("Março");
              break;    
              case 4:
                  System.out.println("Abril"); 
              break;
              case 5:
                  System.out.println("Maio");
              break;
              case 6:
                  System.out.println("Junho");
              break;    
              case 7:
                  System.out.println("Julho");
              break;
              case 8:
                  System.out.println("Agosto");
              break;
              case 9:
                  System.out.println("Setembro");
              break;
              case 10:
                  System.out.println("Outubro");
              break;
              case 11:
                  System.out.println("Novembro");
              break;
              case 12:
                  System.out.println("Dezembro");
              break;
              default:
                  System.out.println("Mês inexistente");
          }
    }
    
}

/*

Faça um algoritmo que leia um número que represente um determinado mês do 
ano. Após a leitura escreva por extenso qual o mês lido. 
Caso o número digitado não esteja na faixa de 1 até 12
escreva uma mensagem informando o usuário do  erro da digitação.

*/
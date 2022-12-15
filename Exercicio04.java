//4) Elaborar um programa que efetue a apresentação do valor da conversão em dólar de um valor lido
// em real. 
//O programa deve solicitar o valor da cotação do dólar e também a quantidade de reais disponível com o
//usuário, para que seja apresentado o valor em moeda americana. 
package Exercicios;
import java.util.Scanner;

public class Exercicio04 {

public static void main (String[]args){

Scanner sc = new Scanner(System.in);

System.out.println("Qual a cotação atual do dólar?");

double cotação = sc.nextInt();

System.out.println("Quantos dólares você possui? ");

double total= sc.nextInt();

double reais = total/cotação;

System.out.println("O valor em moedas americanas é de :" + reais );

}}



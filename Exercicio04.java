//4) Elaborar um programa que efetue a apresenta��o do valor da convers�o em d�lar de um valor lido
// em real. 
//O programa deve solicitar o valor da cota��o do d�lar e tamb�m a quantidade de reais dispon�vel com o
//usu�rio, para que seja apresentado o valor em moeda americana. 
package Exercicios;
import java.util.Scanner;

public class Exercicio04 {

public static void main (String[]args){

Scanner sc = new Scanner(System.in);

System.out.println("Qual a cota��o atual do d�lar?");

double cota��o = sc.nextInt();

System.out.println("Quantos d�lares voc� possui? ");

double total= sc.nextInt();

double reais = total/cota��o;

System.out.println("O valor em moedas americanas � de :" + reais );

}}



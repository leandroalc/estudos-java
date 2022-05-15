package com.leandroalc.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tec = new Scanner(System.in);
		
		int x, y;
		
		System.out.println("Digite o primeiro valor:");
		x = tec.nextInt();
		
		System.out.println("Digite o segundo valor:");
		y = tec.nextInt();
		
		int adicao = adicao(x, y);
		int subtracao = subtracao(x, y);
		int multiplicacao = multiplicacao(x, y);
		double divisao = divisao(x, y);
		
		System.out.println("Adição: " + adicao);
		System.out.println("Subtração: " +subtracao);
		System.out.println("Multiplicação: " + multiplicacao);
		System.out.println("Divisão: " + divisao);
	}
	
	public static int adicao(int x, int y) {
		return x + y;
	}
	public static int subtracao(int x, int y) {
		return x - y;
	}
	public static int multiplicacao(int x, int y) {
		return x * y;
	}
	public static double divisao(int x, int  y) {
		return (double) x / y;
	}
}

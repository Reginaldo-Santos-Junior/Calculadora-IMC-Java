package com.java.IMC;

import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Me informe seu nome: ");
		String nome = sc.next();
		
		System.out.println("Me informe seu peso: ");
		double peso = sc.nextDouble();
		
		System.out.println("Me informe sua altura: ");
		float altura = sc.nextFloat();
		
		double resultado = peso / (altura * altura) ;
		
		String msg = "";
		
		if(resultado >=  18.5 && resultado <=25) {
			msg = "o Peso Ideal";
		} else if (resultado > 25) {
			msg = "SobrePeso";
		} else {
			msg = "Abaixo do peso";
		}
		
		
		
		
		System.out.println("Olá " + nome + "," + " seu IMC é:" + resultado + ", você está com " + msg );
	}
	
}

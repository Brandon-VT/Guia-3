package com.senati.eti;

import java.util.Scanner;

public class Caso08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese n�mero: ");
		int n = sc.nextInt();
		
		System.out.println("Tabla de multiplicar del " + n);
		System.out.println("---------------------------");
		
		for(int i = 1; i <= 15; i++)
			System.out.println(n + " x " + i + " = " + (n*i));
		

	}

}

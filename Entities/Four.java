package Entities;

import java.util.Locale;
import java.util.Scanner;

/*
This program calculates the roots of a quadratic equation
Coefficient values ​​must be entered one per line
https://github.com/ivan-oliven
*/


public class Four {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, delta;
		
		System.out.println("Digite os valores dos coeficientes:");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		delta = b * b - 4 * a * c;
		
		System.out.println("Valor: "+delta);
	}
}
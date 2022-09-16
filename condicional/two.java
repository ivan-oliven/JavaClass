package condicional;
/*A  program that you can  choice your favorite week day
 *  https://github.com/ivan-oliven
 * */

import java.util.Scanner;

public class two {
	public static void main(String[] args) {
		
		System.out.println("Qual seu dia da semana favorito, de 1 a 7");
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		String dia;
		
		if (x == 1) {
			dia = "Seu dia favorito é domingo";
		} else if (x == 2) {
			dia = "Seu dia favorito é segunda";
		} else if (x == 3) {
			dia = "Seu dia favorito é terca";
		} else if (x == 4) {
			dia = "Seu dia favorito é quarta";
		} else if (x == 5) {
			dia = "Seu dia favorito é quinta";
		} else if (x == 6) {
			dia = "Seu dia favorito é sexta";
		} else if (x == 7) {
			dia = "Seu dia favorito é sabado";
		} else {
			dia = "Não consegi computar, você pode digite um valor de 1 a 7";
		}
		
		System.out.println("Dia da semana: " + dia);
		sc.close();
	}
}
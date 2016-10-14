

import java.util.Scanner;

public class Russe {
	public static int arusse(int a, int b) {
		int[] x, y;
		int i = 1, prod = 0;
		x = new int[1000];
		y = new int[1000];
		x[1] = a;
		y[1] = b;

		while (x[i] > 1) {
			x[i + 1] = x[i] / 2;
			y[i + 1] = y[i] + y[i];
			i = i + 1;
		}
		while (i > 0) {
			if ((x[i] % 2) != 0)
				prod = prod + y[i];
			i = i - 1;
		}
		return prod;
	}

	public static void main(String[] args) {
		
		System.out.println("Se efectueaza inmultirea a doua numere:");
		int a = 45;
		System.out.println("Al doilea numar: ");
		int b = 19;
		System.out.println("Produsul celor 2 numere este " + arusse(a, b));
	}
}

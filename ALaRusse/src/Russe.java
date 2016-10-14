

import java.util.*;

public class Russe {
	public static int arusse(int a, int b) {
		List<Integer> x, y;
		int i = 1, prod = 0;
		x = new ArrayList<Integer>();
		y = new ArrayList<Integer>();
		x.set(1, a);
		y.set(1, b);
	    //comment
		while (x.get(i) > 1) {
			x.set(i + 1, x.get(i) / 2);
			//y[i + 1] = y[i] + y[i];
			i = i + 1;
		}
		while (i > 0) {
			//if ((x[i] % 2) != 0)
			//	prod = prod + y[i];
			i = i - 1;
		}
		return prod;
	}
	public void f()
	{
		
	}
	public static void main(String[] args) {
		
		System.out.println("Se efectueaza inmultirea a doua numere:");
		int a = 45;
		System.out.println("Al doilea numar: ");
		int b = 19;
		System.out.println("Produsul celor 2 numere este " + arusse(a, b));
	}
}

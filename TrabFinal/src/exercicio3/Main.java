package exercicio3;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		System.out.println("Matriz 1");
		Matriz m = new Matriz(new double[2][2]);
		inserirValores(m);

		System.out.println("\nMatriz 2");
		Matriz m2 = new Matriz(new double[2][2]);
		inserirValores(m2);

		System.out.println("\nMatriz 3");
		MatrizAdapter ma = new MatrizAdapter(new double[1][1]);
		Matriz m3 = ma.somar(m, m2);
		for (int i = 0; i < m.getColuna(); i++) {
			System.out.print("| ");
			for (int j = 0; j < m.getLinha(); j++) {
				System.out.print(m3.getValor(i, j) + "  ");
			}
			System.out.println("|");
		}
	}

	public static void inserirValores(Matriz m) {

		Random r = new Random();

		for (int i = 0; i < m.getColuna(); i++) {
			System.out.print("|   ");
			for (int j = 0; j < m.getLinha(); j++) {
				m.setValor(i, j, r.nextInt(100));
				System.out.print(m.getValor(i, j) + "   ");
			}
			System.out.println("|");
		}
	}
}

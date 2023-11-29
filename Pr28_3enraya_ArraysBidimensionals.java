package progra_UF1;

import java.util.Iterator;
import java.util.Scanner;

public class Pr28_3enraya_ArraysBidimensionals {

	public static void main(String[] args) {

		Scanner teclat = new Scanner(System.in);

		int[][] taula = { { 0, 0, 0 }, // 1,2,3 - 0.0/0.1/0.2
				{ 0, 0, 0 }, // 4,5,6 - 1.0/1.1/1.2
				{ 0, 0, 0 } }; // 7,8,9 - 2.0/2.1/2.2

		System.out.println("7,8,9");
		System.out.println("4,5,6");
		System.out.println("1,2,3");

		int p = 2;

		impTaula(taula);
		while (true) {
			if (p == 2) {
				p = 1;
			} else {
				p = 2;
			}
			p(taula, p);
			impTaula(taula);
			if (victoria(taula) == true) {
				System.out.println("Revancha ? [s] or [n] ");
				String rev = teclat.next();
				if (rev.equals("s") || rev.equals("S") || rev.equals("SI") || rev.equals("Si") || rev.equals("si")) {
					cleanTaula(taula);
					impTaula(taula);
				} else {
					System.out.println("FINS LA PROXIMA");
					break;
				}
			}

			empat(taula);

		}

	}

	public static void impTaula(int taula[][]) {

		String blue = "\033[36m";
		String red = "\033[31m";
		String rst = "\u001B[0m";

		System.out.println("┌───┬───┬───┐");

		for (int i = 0; i < taula.length; i++) {
			for (int j = 0; j < taula.length; j++) {

				System.out.printf("");

				if (taula[i][j] == 0) {
					System.out.print("│   ");
				} else if (taula[i][j] == 1) {
					System.out.print("│" + red + " ♣ " + rst);
				} else if (taula[i][j] == -1) {
					System.out.print("│" + blue + " ♦ " + rst);
				}
			}
			System.out.println("│");

			if (i != 2) {
				System.out.println("├───┼───┼───┤");
			}

		}
		System.out.println("└───┴───┴───┘");
	}

	public static void p(int taula[][], int jugador) {
		Scanner teclat = new Scanner(System.in);
		System.out.println("tria on vols tirar:♣");
		int triaTirar = teclat.nextInt();

		if (triaTirar == 7) {
			noCambi(taula, jugador, 1);

		} else if (triaTirar == 8) {
			noCambi(taula, jugador, 2);
		} else if (triaTirar == 9) {
			noCambi(taula, jugador, 3);
		} else if (triaTirar == 4) {
			noCambi(taula, jugador, 4);
		} else if (triaTirar == 5) {
			noCambi(taula, jugador, 5);
		} else if (triaTirar == 6) {
			noCambi(taula, jugador, 6);
		} else if (triaTirar == 1) {
			noCambi(taula, jugador, 7);
		} else if (triaTirar == 2) {
			noCambi(taula, jugador, 8);
		} else if (triaTirar == 3) {
			noCambi(taula, jugador, 9);
		}
	}


	public static void noCambi(int taula[][], int p, int casella) {

		if (casella == 1) {

			if (taula[0][0] != 0) {
				System.out.println("La jugada no es posible");
			} else {
				if (p == 2) {
					taula[0][0] = -1;
				} else if (p == 1) {
					taula[0][0] = 1;

				}
			}
		}

		if (casella == 2) {

			if (taula[0][1] != 0) {
				System.out.println("La jugada no es posible");
			} else {
				if (p == 2) {
					taula[0][1] = -1;
				} else if (p == 1) {
					taula[0][1] = 1;

				}
			}
		}

		if (casella == 3) {

			if (taula[0][2] != 0) {
				System.out.println("La jugada no es posible");
			} else {
				if (p == 2) {
					taula[0][2] = -1;
				} else if (p == 1) {
					taula[0][2] = 1;

				}
			}
		}

		if (casella == 4) {

			if (taula[1][0] != 0) {
				System.out.println("La jugada no es posible");
			} else {
				if (p == 2) {
					taula[1][0] = -1;
				} else if (p == 1) {
					taula[1][0] = 1;

				}
			}
		}

		if (casella == 5) {

			if (taula[1][1] != 0) {
				System.out.println("La jugada no es posible");
			} else {
				if (p == 2) {
					taula[1][1] = -1;
				} else if (p == 1) {
					taula[1][1] = 1;

				}
			}
		}

		if (casella == 6) {

			if (taula[1][2] != 0) {
				System.out.println("La jugada no es posible");
			} else {
				if (p == 2) {
					taula[1][2] = -1;
				} else if (p == 1) {
					taula[1][2] = 1;

				}
			}
		}

		if (casella == 7) {

			if (taula[2][0] != 0) {
				System.out.println("La jugada no es posible");
			} else {
				if (p == 2) {
					taula[2][0] = -1;
				} else if (p == 1) {
					taula[2][0] = 1;

				}
			}
		}

		if (casella == 8) {

			if (taula[2][1] != 0) {
				System.out.println("La jugada no es posible");
			} else {
				if (p == 2) {
					taula[2][1] = -1;
				} else if (p == 1) {
					taula[2][1] = 1;

				}
			}
		}

		if (casella == 9) {

			if (taula[2][2] != 0) {
				System.out.println("La jugada no es posible");
			} else {
				if (p == 2) {
					taula[2][2] = -1;
				} else if (p == 1) {
					taula[2][2] = 1;

				}
			}
		}

	}

	public static boolean victoria(int taula[][]) {

		if (taula[0][0] + taula[0][1] + taula[0][2] == 3) {
			System.out.println("Victoria Magistral per ♣");
			return true;
		} else if (taula[0][0] + taula[0][1] + taula[0][2] == -3) { // fila 1
			System.out.println("Victoria Magistral per ♦");
			return true;
		}

		if (taula[1][0] + taula[1][1] + taula[1][2] == 3) {
			System.out.println("Victoria Magistral per ♣");
			return true;
		} else if (taula[1][0] + taula[1][1] + taula[1][2] == -3) { // fila 2
			System.out.println("Victoria Magistral per ♦");
			return true;
		}

		if (taula[2][0] + taula[2][1] + taula[2][2] == 3) {
			System.out.println("Victoria Magistral per ♣");
			return true;
		} else if (taula[2][0] + taula[2][1] + taula[2][2] == -3) { // fila 3
			System.out.println("Victoria Magistral per ♦");
			return true;
		}

		if (taula[0][0] + taula[1][0] + taula[2][0] == 3) {
			System.out.println("Victoria Magistral per ♣");
			return true;
		} else if (taula[0][0] + taula[1][0] + taula[2][0] == -3) { // columna 1
			System.out.println("Victoria Magistral per ♦");
			return true;
		}

		if (taula[0][1] + taula[1][1] + taula[2][1] == 3) {
			System.out.println("Victoria Magistral per ♣");
			return true;
		} else if (taula[0][1] + taula[1][1] + taula[2][1] == -3) { // columna 2
			System.out.println("Victoria Magistral per ♦");
			return true;
		}

		if (taula[0][2] + taula[1][2] + taula[2][2] == 3) {
			System.out.println("Victoria Magistral per ♣");
			return true;
		} else if (taula[0][2] + taula[1][2] + taula[2][2] == -3) { // columna 3
			System.out.println("Victoria Magistral per ♦");
			return true;
		}

		if (taula[0][0] + taula[1][1] + taula[2][2] == 3) {
			System.out.println("Victoria Magistral per ♣");
			return true;
		} else if (taula[0][0] + taula[1][1] + taula[2][2] == -3) { // diagonal 1
			System.out.println("Victoria Magistral per ♦");
			return true;
		}

		if (taula[2][0] + taula[1][1] + taula[0][2] == 3) {
			System.out.println("Victoria Magistral per ♣");
			return true;
		} else if (taula[2][0] + taula[1][1] + taula[0][2] == -3) { // diagonal 2
			System.out.println("Victoria Magistral per ♦");
			return true;
		}
		return false;
	}

	public static void empat(int taula[][]) {
		if ((taula[0][0] & taula[0][1] & taula[0][2] & taula[1][0] & taula[1][1] & taula[1][2] & taula[2][0]
				& taula[2][1] & taula[2][2]) != 0) {
			System.out.println("EMPAT MAGISTRAL");

			cleanTaula(taula);
			impTaula(taula);

		}
	}

	public static void cleanTaula(int taula[][]) {
		for (int i = 0; i < taula.length; i++) {
			for (int j = 0; j < taula.length; j++) {
				taula[i][j] = 0;
			}
		}
	}

}

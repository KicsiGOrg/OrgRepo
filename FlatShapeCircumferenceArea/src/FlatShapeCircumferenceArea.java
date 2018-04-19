import java.text.DecimalFormat;
import java.util.Scanner;

public class FlatShapeCircumferenceArea {

	static Scanner sc;
	static int menuIndex;
	static DecimalFormat df = new DecimalFormat(".##");

	public static void main(String[] args) {

		System.out.println("Síkidomok kerület és terület számítása.\n" + "\n	MENÜ\n" + "------------------\n"
				+ " 1 - Négyzet\n" + " 2 - Téglalap\n" + " 3 - Rombusz\n" + " 4 - Trapéz\n" + " 5 - Paralelogramma\n"
				+ " 6 - Deltoid\n" + " 7 - Kör\n" + " 8 - Ellipszis");

		selectAnAction();
		menuOperations(menuIndex);
		sc.close();
		System.out.println("\nViszontlátásra.");
	}

	private static int selectAnAction() {

		do {
			sc = new Scanner(System.in);
			System.out.print("Kérem válasszon a menüből: ");
			menuIndex = sc.nextInt();
			sc.nextLine();
			if (menuIndex < 1 || menuIndex > 8) {
				System.out.println("A megadott menü szám nem értelmezett.");
			}
		} while (menuIndex < 1 || menuIndex > 8);
		return menuIndex;
	}

	private static void menuOperations(int menuIndex) {
		switch (menuIndex) {
		case 1:
			square();
			break;
		case 2:
			rectangle();
			break;
		case 3:
			rombus();
			break;
		case 4:
			trapeze();
			break;
		case 5:
			paralelogramma();
			break;
		case 6:
			deltoid();
			break;
		case 7:
			circle();
			break;
		case 8:
			ellipse();
			break;
		}
	}

	private static void square() {
		int sideSquareA;
		do {
			System.out.print("Kérem adja meg a négyszög oldalát [cm]: ");
			sideSquareA = sc.nextInt();
			sc.nextLine();
			if (sideSquareA <= 0) {
				System.out.println("A megadott méret túl kicsi, kérem 0-nál nagyobb számot adjon meg.");
			}
		} while (sideSquareA <= 0);
		System.out.println("A négyszög kerülete: " + 4 * sideSquareA + " cm");
		System.out.println("A négyszög területe: " + (int) Math.pow(sideSquareA, 2) + " cm\u00B2");
	}

	private static void rectangle() {
		int sideRectangleA;
		int sideRectangleB;
		do {
			System.out.print("Kérem adja meg a téglalap \"a\" oldalát [cm]: ");
			sideRectangleA = sc.nextInt();
			sc.nextLine();
			if (sideRectangleA <= 0) {
				System.out.println("A megadott méret túl kicsi, kérem 0-nál nagyobb számot adjon meg.");
			}
		} while (sideRectangleA <= 0);
		do {
			System.out.print("Kérem adja meg a téglalap \"b\" oldalát [cm]: ");
			sideRectangleB = sc.nextInt();
			sc.nextLine();
			if (sideRectangleB <= 0) {
				System.out.println("A megadott méret túl kicsi, kérem 0-nál nagyobb számot adjon meg.");
			}
		} while (sideRectangleB <= 0);
		int k = (2 * sideRectangleA) + (2 * sideRectangleB);
		int t = sideRectangleA * sideRectangleB;
		System.out.println("A téglalap kerülete: " + k + " cm");
		System.out.println("A téglalap területe: " + t + " cm\u00B2");
	}

	private static void rombus() {
		int eAxis;
		int fAxis;
		do {
			System.out.print("Kérem adja meg a rombusz \"e\" tengelyét [cm]: ");
			eAxis = sc.nextInt();
			sc.nextLine();
			if (eAxis <= 0) {
				System.out.println("A megadott méret túl kicsi, kérem 0-nál nagyobb számot adjon meg.");
			}
		} while (eAxis <= 0);
		do {
			System.out.print("Kérem adja meg a rombusz \"f\" tengelyét [cm]: ");
			fAxis = sc.nextInt();
			sc.nextLine();
			if (fAxis <= eAxis) {
				System.out.println(
						"A tengelyek hossza megegyezik, vagy a megadott méret túl kicsi\nKérem az \"e\" tengelynél ("
								+ eAxis + ") nagyobb számot adjon meg.");
			}
		} while (fAxis <= eAxis);
		double sideRombusA = Math.sqrt(Math.pow((eAxis / 2), 2) + Math.pow((fAxis / 2), 2));
		double k = 4 * sideRombusA;
		double t = (eAxis * fAxis) / 2;
		System.out.println("A rombusz kerülete: " + df.format(k) + " cm");
		System.out.println("A rombusz területe: " + df.format(t) + " cm\u00B2");
	}

	private static void trapeze() {
		int sideTrapezeA;
		int sideTrapezeBD;
		int sideTrapezeC;
		do {
			System.out.print("Kérem adja meg a trapéz \"a\" oldalát [cm]: ");
			sideTrapezeA = sc.nextInt();
			sc.nextLine();
			if (sideTrapezeA <= 0) {
				System.out.println("A megadott méret túl kicsi, kérem 0-nál nagyobb számot adjon meg.");
			}
		} while (sideTrapezeA <= 0);
		do {
			System.out.print("Kérem adja meg a téglalap \"c\" oldalát [cm]: ");
			sideTrapezeC = sc.nextInt();
			sc.nextLine();
			if (sideTrapezeC <= 0) {
				System.out.println("A megadott méret túl kicsi, kérem 0-nál nagyobb számot adjon meg.");
			}
		} while (sideTrapezeC <= 0);
		do {
			System.out.print("Kérem adja meg a téglalap \"b\" és \"d\" oldalát [cm]: ");
			sideTrapezeBD = sc.nextInt();
			sc.nextLine();
			if (sideTrapezeBD <= 0) {
				System.out.println("A megadott méret túl kicsi, kérem 0-nál nagyobb számot adjon meg.");
			}
		} while (sideTrapezeBD <= 0);
		double a = sideTrapezeA - sideTrapezeC;
		a = a / 2;
		double c = sideTrapezeBD;
		double m = Math.sqrt((Math.pow(c, 2) - Math.pow(a, 2)));
		int k = sideTrapezeA + sideTrapezeC + (2 * sideTrapezeBD);
		double t = sideTrapezeA + sideTrapezeC;
		t = t / 2;
		t = t*m;
		System.out.println("A téglalap kerülete: " + k + " cm");
		System.out.println("A téglalap területe: " + df.format(t) + " cm\u00B2");
	}

	private static void paralelogramma() {
		int k;
		double t;
		int sideParalelogrammaA;
		int sideParalelogrammaB;
		double delta;
		do {
			System.out.print("Kérem adja meg a paralelogramma \"a\" oldalát [cm]: ");
			sideParalelogrammaA = sc.nextInt();
			sc.nextLine();
			if (sideParalelogrammaA <= 0) {
				System.out.println("A megadott méret túl kicsi, kérem 0-nál nagyobb számot adjon meg.");
			}
		} while (sideParalelogrammaA <= 0);
		do {
			System.out.print("Kérem adja meg a paralelogramma \"b\" oldalát [cm]: ");
			sideParalelogrammaB = sc.nextInt();
			sc.nextLine();
			if (sideParalelogrammaB <= 0) {
				System.out.println("A megadott méret túl kicsi, kérem 0-nál nagyobb számot adjon meg.");
			}
		} while (sideParalelogrammaB <= 0);
		do {
			System.out.print("Kérem adja meg a paralelogramma \u03B4 szögét [°]: ");
			delta = sc.nextInt();
			sc.nextLine();
			if (delta > 180 || delta < 0) {
				System.out.println("A megadott méret nem érvényes.\nKérem 0-nál nagyobb és 180-nál kisebb számot adjon meg.");
			}
		}while(delta > 180 || delta < 0);
		if(delta == 90) {
			if(sideParalelogrammaA == sideParalelogrammaB) {
				System.out.println("Azokat a paralelogrammákat, amiknek a belső szögeik derék szögűek, és az oldalalaik egyenlőek, négyzetnek nevezzük.");
			}else{
				System.out.println("Azokat a paralelogrammákat, amiknek a belső szögeik derék szögűek, de az \"a\" és \"b\" oldalalaik nem egyenlőek, téglalapnak nevezzük.");
			}
		}else {
			if(sideParalelogrammaA == sideParalelogrammaB) {
				System.out.println("Azokat a paralelogrammákat, amiknek a belső szögeik nem derék szögűek, de az oldalalaik egyenlőek, rombusznak nevezzük.");
			}
		}
		k = (2 * sideParalelogrammaA) + (2 * sideParalelogrammaB);
		delta = Math.toRadians(delta);
		t = sideParalelogrammaA * sideParalelogrammaB * Math.sin(delta);
		System.out.println("A paralelogramma kerülete: " + k + " cm");
		System.out.println("A paralelogramma területe: " + df.format(t) + " cm\u00B2");
	}

	private static void deltoid() {
		int sideDeltoidA;
		int sideDeltoidB;
		int eAxis;
		int fAxis;
		do {
			System.out.print("Kérem adja meg a deltoid \"a\" oldalát [cm]: ");
			sideDeltoidA = sc.nextInt();
			sc.nextLine();
			if (sideDeltoidA <= 0) {
				System.out.println("A megadott méret túl kicsi, kérem 0-nál nagyobb számot adjon meg.");
			}
		} while (sideDeltoidA <= 0);
		do {
			System.out.print("Kérem adja meg a deltoid \"b\" oldalát [cm]: ");
			sideDeltoidB = sc.nextInt();
			sc.nextLine();
			if (sideDeltoidB <= 0) {
				System.out.println("A megadott méret túl kicsi, kérem 0-nál nagyobb számot adjon meg.");
			}
		} while (sideDeltoidB <= 0);
		do {
			System.out.print("Kérem adja meg a deltoid \"e\" tengelyét [cm]: ");
			eAxis = sc.nextInt();
			sc.nextLine();
			if (eAxis <= 0) {
				System.out.println("A megadott méret túl kicsi, kérem 0-nál nagyobb számot adjon meg.");
			}
		} while (eAxis <= 0);
		do {
			System.out.print("Kérem adja meg a deltoid \"f\" tengelyét [cm]: ");
			fAxis = sc.nextInt();
			sc.nextLine();
			if (fAxis <= eAxis) {
				System.out.println(
						"A tengelyek hossza megegyezik, vagy a megadott méret túl kicsi\nKérem az \"e\" tengelynél ("
								+ eAxis + ") nagyobb számot adjon meg.");
			}
		} while (fAxis <= eAxis);

		double k = 2 * (sideDeltoidA + sideDeltoidA);
		double t = (eAxis * fAxis) / 2;
		System.out.println("A deltoid kerülete: " + k + " cm");
		System.out.println("A deltoid területe: " + t + " cm\u00B2");
	}

	private static void circle() {
		int radius;
		do {
			System.out.print("Kérem adja meg a kör sugarát [cm]: ");
			radius = sc.nextInt();
			sc.nextLine();
			if (radius <= 0) {
				System.out.println("A megadott méret túl kicsi, kérem 0-nál nagyobb számot adjon meg.");
			}
		} while (radius <= 0);
		System.out.println("A kör kerülete: " + df.format(2 * radius * Math.PI) + " cm");
		System.out.println("A kör területe: " + df.format(Math.pow(radius, 2) * Math.PI) + " cm\u00B2");
	}

	private static void ellipse() {
		int eAxis;
		int fAxis;
		do {
			System.out.print("Kérem adja meg az ellipszis \"e\" tengelyét [cm]: ");
			eAxis = sc.nextInt();
			sc.nextLine();
			if (eAxis <= 0) {
				System.out.println("A megadott méret túl kicsi, kérem 0-nál nagyobb számot adjon meg.");
			}
		} while (eAxis <= 0);
		do {
			System.out.print("Kérem adja meg az ellipszis \"f\" tengelyét [cm]: ");
			fAxis = sc.nextInt();
			sc.nextLine();
			if (fAxis <= eAxis) {
				System.out.println(
						"A tengelyek hossza megegyezik, vagy a megadott méret túl kicsi\nKérem az \"e\" tengelynél ("
								+ eAxis + ") nagyobb számot adjon meg.");
			}
		} while (fAxis <= eAxis);
		double k = 4 * (((Math.PI * eAxis * fAxis) + Math.pow(eAxis - fAxis, 2)) / (eAxis + fAxis));
		double t = (eAxis / 2) * (fAxis /2) *  Math.PI;
		System.out.println("Az ellipszis kerülete\u2248 " + df.format(k) + " cm");
		System.out.println("Az ellipszis területe\u2248 " + df.format(t) + " cm\u00B2");
	}
}

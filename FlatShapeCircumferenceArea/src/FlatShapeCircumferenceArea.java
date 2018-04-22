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
		int sideA;
		do {
			sideA = getSideA();
		} while (sideA <= 0);
		System.out.println("A négyszög kerülete: " + 4 * sideA + " cm");
		System.out.println("A négyszög területe: " + (int) Math.pow(sideA, 2) + " cm\u00B2");
	}

	private static void rectangle() {
		int sideA;
		int sideB;
		do {
			sideA = getSideA();
		} while (sideA <= 0);
		do {
			sideB = getSideB();
		} while (sideB <= 0);
		int k = (2 * sideA) + (2 * sideB);
		int t = sideA * sideB;
		System.out.println("A téglalap kerülete: " + k + " cm");
		System.out.println("A téglalap területe: " + t + " cm\u00B2");
	}

	private static void rombus() {
		int eAxis;
		int fAxis;
		do {
			eAxis = getAxisE();
		} while (eAxis <= 0);
		do {
			fAxis = getAxisF(eAxis);
		} while (fAxis <= eAxis);
		double sideRombusA = Math.sqrt(Math.pow((eAxis / 2), 2) + Math.pow((fAxis / 2), 2));
		double k = 4 * sideRombusA;
		double t = (eAxis * fAxis) / 2;
		System.out.println("A rombusz kerülete: " + df.format(k) + " cm");
		System.out.println("A rombusz területe: " + df.format(t) + " cm\u00B2");
	}

	private static void trapeze() {
		int sideA;
		int sideBD;
		int sideC;
		do {
			sideA = getSideA();
		} while (sideA <= 0);
		do {
			sideBD = getSideB();
		} while (sideBD <= 0);
		do {
			System.out.print("Kérem adja meg a síkidom harmadik oldalának a hosszát [cm]: ");
			sideC = sc.nextInt();
			sc.nextLine();
			if (sideC <= 0) {
				System.out.println("A megadott méret túl kicsi, kérem 0-nál nagyobb számot adjon meg.");
			}
		} while (sideC <= 0);
		
		double a = sideA - sideC;
		a = a / 2;
		double c = sideBD;
		double m = Math.sqrt((Math.pow(c, 2) - Math.pow(a, 2)));
		int k = sideA + sideC + (2 * sideBD);
		double t = sideA + sideC;
		t = t / 2;
		t = t*m;
		System.out.println("A téglalap kerülete: " + k + " cm");
		System.out.println("A téglalap területe: " + df.format(t) + " cm\u00B2");
	}

	private static void paralelogramma() {
		int k;
		double t;
		int sideA;
		int sideB;
		double delta;
		do {
			sideA = getSideA();
		} while (sideA <= 0);
		do {
			sideB = getSideB();
		} while (sideB <= 0);
		do {
			System.out.print("Kérem adja meg a síkidom \u03B4 szögét [°]: ");
			delta = sc.nextInt();
			sc.nextLine();
			if (delta > 180 || delta < 0) {
				System.out.println("A megadott méret nem érvényes.\nKérem 0-nál nagyobb és 180-nál kisebb számot adjon meg.");
			}
		}while(delta > 180 || delta < 0);
		if(delta == 90) {
			if(sideA == sideB) {
				System.out.println("Azokat a paralelogrammákat, amiknek a belső szögeik derék szögűek, és az oldalalaik egyenlőek, négyzetnek nevezzük.");
			}else{
				System.out.println("Azokat a paralelogrammákat, amiknek a belső szögeik derék szögűek, de az \"a\" és \"b\" oldalalaik nem egyenlőek, téglalapnak nevezzük.");
			}
		}else {
			if(sideA == sideB) {
				System.out.println("Azokat a paralelogrammákat, amiknek a belső szögeik nem derék szögűek, de az oldalalaik egyenlőek, rombusznak nevezzük.");
			}
		}
		k = (2 * sideA) + (2 * sideB);
		delta = Math.toRadians(delta);
		t = sideA * sideB * Math.sin(delta);
		System.out.println("A paralelogramma kerülete: " + k + " cm");
		System.out.println("A paralelogramma területe: " + df.format(t) + " cm\u00B2");
	}

	private static void deltoid() {
		int sideA;
		int sideB;
		int eAxis;
		int fAxis;
		do {
			sideA = getSideA();
		} while (sideA <= 0);
		do {
			sideB = getSideB();
		} while (sideB <= 0);
		do {
			eAxis = getAxisE();
		} while (eAxis <= 0);
		do {
			fAxis = getAxisF(eAxis);
		} while (fAxis <= eAxis);

		double k = 2 * (sideA + sideA);
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
			eAxis = getAxisE();
		} while (eAxis <= 0);
		do {
			fAxis = getAxisF(eAxis);
		} while (fAxis <= eAxis);
		double k = 4 * (((Math.PI * eAxis * fAxis) + Math.pow(eAxis - fAxis, 2)) / (eAxis + fAxis));
		double t = (eAxis / 2) * (fAxis /2) *  Math.PI;
		System.out.println("Az ellipszis kerülete\u2248 " + df.format(k) + " cm");
		System.out.println("Az ellipszis területe\u2248 " + df.format(t) + " cm\u00B2");
	}
	

	private static int getSideA() {
		int sideA;
		System.out.print("Kérem adja meg a síkidom egyik oldalának a hosszát [cm]: ");
		sideA = sc.nextInt();
		sc.nextLine();
		if (sideA <= 0) {
			System.out.println("A megadott méret túl kicsi, kérem 0-nál nagyobb számot adjon meg.");
		}
		return sideA;
	}
	
	
	private static int getSideB() {
		int sideB;
		System.out.print("Kérem adja meg a síkidom másik oldalának a hosszát [cm]: ");
		sideB = sc.nextInt();
		sc.nextLine();
		if (sideB <= 0) {
			System.out.println("A megadott méret túl kicsi, kérem 0-nál nagyobb számot adjon meg.");
		}
		return sideB;
	}

	
	private static int getAxisE() {
		int eAxis;
		System.out.print("Kérem adja meg a síkidom rövidebb tengelyét [cm]: ");
		eAxis = sc.nextInt();
		sc.nextLine();
		if (eAxis <= 0) {
			System.out.println("A megadott méret túl kicsi, kérem 0-nál nagyobb számot adjon meg.");
		}
		return eAxis;
	}

	
	private static int getAxisF(int eAxis) {
		int fAxis;
		System.out.print("Kérem adja meg a síkidom hosszabb tengelyét [cm]: ");
		fAxis = sc.nextInt();
		sc.nextLine();
		if (fAxis <= eAxis) {
			System.out.println(
					"A tengelyek hossza megegyezik, vagy a megadott méret túl kicsi\nKérem a rövidebb tengely hosszánál ("
							+ eAxis + ") nagyobb számot adjon meg.");
		}
		return fAxis;
	}
	

}


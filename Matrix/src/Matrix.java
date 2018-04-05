
public class Matrix {

	public static void main(String[] args) {

		int[][] aMatrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] bMatrix = { { 2, 3, 4 }, { 5, 6, 7 }, { 8, 9, 10 } };

		System.out.println("----------Mátrixok összeadása----------\n");
		for (int i = 0; i < aMatrix.length; i++) {
			for (int j = 0; j < bMatrix.length; j++) {
				int d = aMatrix[i][j] + bMatrix[i][j];
				
				System.out.println("Mátrixok összege: " + d);
			}
		}
		System.out.println("\n----------Mátrixok kivonása----------\n");
		for (int i = 0; i < aMatrix.length; i++) {
			for (int j = 0; j < bMatrix.length; j++) {
				int d = aMatrix[i][j] - bMatrix[i][j];
				
				System.out.println("Mátrixok különbsége: " + d);
			}
		}
		System.out.println("\n----------Mátrixok szorzata----------\n");
		for (int i = 0; i < aMatrix.length; i++) {
			for (int j = 0; j < bMatrix.length; j++) {
				int[] z = new int[9];
				z[j]  = aMatrix[i][j] * bMatrix[j][i];
				System.out.print(z[j]+" ");
				if(j==2) {
					System.out.println();
				}
			}
		}
	}
}
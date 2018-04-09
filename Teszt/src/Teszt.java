import java.util.stream.IntStream;

public class Teszt {

	public static void main(String[] args) {
	
		int number = 123456;
		String strNumber = String.valueOf(number);
		int width = 12; 	// 12 char hosszúságban határozom meg a számot
		char fill = '0'; 	// 0-val fogom kiegészíteni, ha a szöveg hossza nem éri el a width-ben megadott értéket  

		strNumber = new String(new char[width - strNumber.length()]).replace('\0', fill) + strNumber; // a fill-ben megadott char-al fogom kiegészíteni a szöveg elejét!
		
		int xyz;
		int[] sevenArray = new int[4];
		int beginIndexNumber = 3;
		int endIndexNumber = 0;
		int multiplier;
		
		for(int i = 0; i < 4; i++) {
			if(i == 0 || i == 2) {
				multiplier = +1;
			}else {
				multiplier = -1;
			}
			String strFourthThreeDigits = strNumber.substring(strNumber.length() - beginIndexNumber, strNumber.length() - endIndexNumber);
			int intFourthThreeDigits = Integer.parseInt(strFourthThreeDigits);
			sevenArray[i] = intFourthThreeDigits * multiplier;
			beginIndexNumber += 3;
			endIndexNumber += 3;
		}
		
		for(int i = 0; i < 4; i++) {
			System.out.println(sevenArray[i]);
		}
		
		int sumNumber = IntStream.of(sevenArray).sum();
		if(sumNumber < 0) {
			sumNumber = sumNumber * -1;
		}
		
		xyz = sumNumber - 7;
		if (sumNumber == 7) {
			
			}
		for (int i = 0; xyz >= 0; i++) {
			xyz = xyz - 7;
			if (xyz == 0) {
			}
		}
	}
}
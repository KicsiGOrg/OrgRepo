
public class Calendar {

	public static void main(String[] args) {

		String[][] tomb = {
				{"	      |","		Hétfõ      "," |	    Kedd         ","|	       Szerda           ","|     Csütörtök      ","|	     Péntek        ","|	  Szombat       ","|	Vasárnap     |\n"},
				{" 6:00 - 7:00  |"," Bundást sétáltatni  ","| Bundást sétáltatni ","|      Bundást sétáltatni      ","| Bundást sétáltatni ","| Bundást sétáltatni  ","| Bundást sétáltatni ","| Bundást sétáltatni |\n"},
				{" 7:00 - 8:00  |","                     ","|                    ","|                              ","|                    ","|                     ","|                    ","|                    |\n"},
				{" 8:00 - 9:00  |","                     ","|                    ","|                              ","|                    ","|                     ","|     Kirándulás     ","|                    |\n"},
				{" 9:00 - 10:00 |","autót szervizbe vinni","|                    ","|                              ","|                    ","|                     ","|     Kirándulás     ","|                    |\n"},
				{"10:00 - 11:00 |","                     ","|   ebédet fõzni     ","|                              ","|                    ","|                     ","|     Kirándulás     ","|                    |\n"},
				{"11:00 - 12:00 |","                     ","|                    ","|                              ","|                    ","|                     ","|     Kirándulás     ","|                    |\n"},
				{"12:00 - 13:00 |","                     ","|                    ","|                              ","|                    ","|                     ","|     Kirándulás     ","|                    |\n"},
				{"13:00 - 14:00 |","                     ","|                    ","|számítógép alkatrészt rendelni","|                    ","|                     ","|     Kirándulás     ","|                    |\n"},
				{"14:00 - 15:00 |","                     ","|                    ","|                              ","|                    ","|                     ","|     Kirándulás     ","|        mozi        |\n"},
				{"15:00 - 16:00 |","                     ","|                    ","|                              ","|                    ","|                     ","|     Kirándulás     ","|        mozi        |\n"},
				{"16:00 - 17:00 |","                     ","|                    ","|                              ","|                    ","|                     ","|     Kirándulás     ","|        mozi        |\n"},
				{"17:00 - 18:00 |","                     ","|                    ","|                              ","|                    ","| vacsorát készíteni  ","|                    ","|                    |\n"},
				{"18:00 - 19:00 |"," Bundást sétáltatni  ","| Bundást sétáltatni ","|      Bundást sétáltatni      ","| Bundást sétáltatni ","| Bundást sétáltatni  ","| Bundást sétáltatni ","| Bundást sétáltatni |\n"}
				};
		
		for(String[] aTomb : tomb) {
			for(String anTomb : aTomb) {
				System.out.print(anTomb);
			}
		}
	}
}

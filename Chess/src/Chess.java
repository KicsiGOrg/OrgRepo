public class Chess {

    public static void main(String[] args) {

        String[][] chessTable =
                {
                	{" \u265C "," \u265E "," \u265D "," \u265B "," \u265A "," \u265D "," \u265E "," \u265C \n"},
                    {" \u265F "," \u265F "," \u265F "," \u265F "," \u265F "," \u265F "," \u265F "," \u265F \n"},
                    {" \u25A1 "," █ "," \u25A1 ","  █ " ," \u25A1 "," █ "," \u25A1 "," █ \n"},
                    {" █ "," \u25A1 "," █ ","  \u25A1 "," █ "," \u25A1 "," █ "," \u25A1 \n"},
                    {" \u25A1 "," █ "," \u25A1 ","  █ "," \u25A1 "," █ "," \u25A1 "," █ \n"},
                    {" █ "," \u25A1 "," █ ","  \u25A1 "," █ "," \u25A1 "," █ "," \u25A1 \n"},
                    {" \u2659 "," \u2659 "," \u2659 "," \u2659 "," \u2659 "," \u2659 "," \u2659 "," \u2659 \n"},
                    {" \u2656 "," \u2658 "," \u2657 "," \u2655 "," \u2654 "," \u2657 "," \u2658 "," \u2656 \n"}
                };

        for (String[] aTomb : chessTable) {
            for (String anTomb : aTomb) {
                System.out.print(anTomb);
            }
        }
    }
}

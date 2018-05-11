public class DrawChessTable {
    public static void main(String[] args) {
        // Crate a program that draws a chess table like this
        //
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        //

        int sizeOfChessTable = 8;

        for (int i = 1; i <= sizeOfChessTable; i++) {
            for (int j = 1; j <= sizeOfChessTable; j++) {
                if (i % 2 != 0 && j % 2 != 0) {
                    System.out.print("%");
                } else if (i % 2 == 0 && j % 2 == 0) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");

        }
    }
}
